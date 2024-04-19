package comicshop.app;
import comicshop.products.Comics;
import comicshop.products.Merchandise;
import comicshop.products.Products;
import comicshop.users.Administrators;
import comicshop.users.Customers;
import comicshop.users.Users;

import java.util.*;

public class ComicShop {
    private Products[] products;
    private Users[] users;

    void initialize() {
        products = new Products[20];
        products[0] = new Comics("Batman", 102,"spanish",1999,
                6.99f, 25);
        products[1] = new Comics("Batman", 203,"english",1982,
                9.99f, 33);
        products[2] = new Comics("Spiderman", 003,"spanish",1995,
                44.99f, 12);
        products[3] = new Comics("Mortadelo", 012,"spanish",1979,
                16.99f, 7);
        products[4] = new Comics("Mortadelo", 007,"spanish",1983,
                19.99f, 5);
        products[5] = new Comics("Tintin", 001,"spanish",1970,
                249.99f, 3);
        products[6] = new Comics("Asterix", 001,"french",1999,
                12.99f, 25);
        products[7] = new Comics("Asterix", 015,"french",1999,
                6.99f, 45);
        products[8] = new Comics("Tintin", 001,"english",1999,
                249.99f, 2);
        products[9] = new Comics("Neon Genesis Evangelion", 001,"japanese",
                1999,49.99f, 10);
        products[10] = new Merchandise("T-shirt", 19.99f, 100, "clothing",
                "T-shirt with the logo of the comic shop");
        products[11] = new Merchandise("Super-Mario Mug", 9.99f, 50, "merchandise",
                "Mug with the logo of Super-Mario");
        products[12] = new Merchandise("Batman Mug", 9.99f, 25, "merchandise",
                "Mug with the logo of Batman");
        products[13] = new Merchandise("Sword", 49.99f, 10, "weapon",
                "Sword from the movie Lord of the Rings");
        products[14] = new Merchandise("Shield", 39.99f, 15, "weapon",
                "Shield from the movie Lord of the Rings");
        products[15] = new Merchandise("Amiibo", 14.99f, 30, "collection",
                "Amiibo of the character Link");
        products[16] = new Merchandise("Amiibo", 14.99f, 30, "collection",
                "Amiibo of the character Mario");
        products[17] = new Merchandise("Amiibo", 14.99f, 30, "collection",
                "Amiibo of the character Pikachu");
        products[18] = new Merchandise("Amiibo", 14.99f, 30, "collection",
                "Amiibo of the character Samus");
        products[19] = new Merchandise("Amiibo", 14.99f, 30, "collection",
                "Amiibo of the character Donkey Kong");

        users = new Users[4];
        users[0] = new Administrators("admin", "admin");
        users[1] = new Administrators("55150517J", "MTSBRR07!$147");
        users[2] = new Customers("user1", "user1", "userCustomer@anyEmail.com");
        users[3] = new Customers("Matías Borra", "Matias123", "matias@gmail.com");

    }

    public Users login(String login, String password){
        Users loggedIn = null;
        for(Users user : users){
            if(user != null && Objects.equals(user.getLogin(), login) && Objects.equals(user.getPassword(), password)){
                loggedIn = user;
            }
        }
        return loggedIn;
    }

    public void stockQuantity() {
        Arrays.sort(products, new Comparator<Products>() {
            @Override
            public int compare(Products p1, Products p2) {
                return Integer.compare(p1.getStockQuantity(), p2.getStockQuantity());
            }
        });

        for (Products product : products) {
            System.out.println("Product: " + product.getName() + " - " +
                            product.getStockQuantity() + " units\n");
        }
    }

    public void totalValueStock() {
        float totalValue = 0;
        for (Products product : products) {
            if(product != null && product.getStockQuantity() > 0)
                totalValue += product.getPrice() * product.getStockQuantity();
        }
        System.out.println(String.format("Total value of the stock: %.2f €", totalValue));
    }

    public void displayComicsInStock() {
        Comics[] comicsArray = Arrays.stream(products)
                .filter(product -> product instanceof Comics)
                .toArray(Comics[]::new);

        Arrays.sort(comicsArray);

        for (Comics comic : comicsArray) {
            System.out.println(comic);
        }
    }

    public void displayMerchandiseInStock() {
        Merchandise[] merchandiseArray = Arrays.stream(products)
                .filter(product -> product instanceof Merchandise)
                .toArray(Merchandise[]::new);

        Arrays.sort(merchandiseArray);

        for (Merchandise merchandise : merchandiseArray) {
            System.out.println(merchandise);
        }
    }
}
