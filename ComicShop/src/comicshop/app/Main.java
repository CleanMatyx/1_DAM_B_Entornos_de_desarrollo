package comicshop.app;

import comicshop.products.Comics;
import comicshop.users.Users;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Users currentUser = null;

    enum administratorMenu{
        SHOW_ALL_ITEMS_SORTED, CALCULATE_TOTAL_VALUE, LOGOUT
    }
    enum customersMenu{
        SHOW_SORTED_COMICS, SHOW_SORTED_MERCHANDISE, LOGOUT
    }

    public static void main(String[] args) {
        ComicShop comicShop1 = new ComicShop();
        comicShop1.initialize();
        boolean loggedIn = false;
        do{
            logIn(loggedIn, comicShop1);
            typeOfUser(currentUser, comicShop1);
        }while(currentUser == null);
    }

    public static void logIn(boolean loggedIn, ComicShop comicShop1){
        while(!loggedIn) {
            System.out.println("Enter your user: ");
            String user = scanner.nextLine();
            System.out.println("Enter your password: ");
            String password = scanner.nextLine();
            Users logUser = comicShop1.login(user, password);
            if (logUser == null) {
                System.out.println("Login failed. Try again.");
            } else {
                System.out.println("Login successful.");
                loggedIn = true;
                currentUser = logUser;
            }
        }
    }

    public static void typeOfUser(Users currentUser, ComicShop comicShop1){
        if(currentUser instanceof comicshop.users.Administrators){
            administratorMenu(comicShop1);
        } else {
            customersMenu(comicShop1);
        }
    }

    public static void administratorMenu(ComicShop comicShop1){
        administratorMenu menu;
        do{
            menu = showAdministratorMenu();
            optionsAdministratorMenu(menu, comicShop1);
        } while(menu != administratorMenu.LOGOUT);
    }

    private static void optionsAdministratorMenu(administratorMenu menu, ComicShop comicShop1) {
        switch(menu){
            case SHOW_ALL_ITEMS_SORTED:
                comicShop1.stockQuantity();
                break;
            case CALCULATE_TOTAL_VALUE:
                comicShop1.totalValueStock();
                break;
            case LOGOUT:
                currentUser = null;
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    private static administratorMenu showAdministratorMenu() {
        try {
            System.out.println("Welcome user: " + currentUser.getLogin() + "Please select an option: ");
            System.out.println();
            System.out.println("1. Show all items in stock");
            System.out.println("2. Calculate total value of the inventory");
            System.out.println("3. Logout");
            return administratorMenu.values()[Integer.parseInt(scanner.nextLine()) - 1];
        } catch (Exception e) {
            System.out.println("Invalid option");
            return administratorMenu.LOGOUT;
        }
    }

    public static void customersMenu(ComicShop comicShop1){
        customersMenu menu;
        do{
            menu = showCustomersMenu();
            optionsCustomersMenu(menu, comicShop1);
        } while(menu != customersMenu.LOGOUT);
    }

    private static void optionsCustomersMenu(customersMenu menu, ComicShop comicShop1) {
        switch (menu){
            case SHOW_SORTED_COMICS:
                comicShop1.displayComicsInStock();
                break;
            case SHOW_SORTED_MERCHANDISE:
                comicShop1.displayMerchandiseInStock();
                break;
            case LOGOUT:
                currentUser = null;
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    private static customersMenu showCustomersMenu() {
        try{
            System.out.println("Welcome user: " + currentUser.getLogin() + "Please select an option: ");
            System.out.println();
            System.out.println("1. Show avaliable comics sorted by name and issue number");
            System.out.println("2. Show avaliable merchandise sorted by category");
            System.out.println("3. Logout");
            return customersMenu.values()[Integer.parseInt(scanner.nextLine()) - 1];
        } catch (Exception e){
            System.out.println("Invalid option");
            return customersMenu.LOGOUT;
        }
    }
}
