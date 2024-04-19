package comicshop.products;

public class Merchandise extends Products implements Comparable<Merchandise>{
    private String category;
    private String description;

    public Merchandise(String name, float price, int stockQuantity, String category, String description) {
        super(name, price, stockQuantity);
        this.category = category;
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int compareTo(Merchandise m) {
        int value = this.getCategory().compareTo(m.getCategory());
        return value;
    }

    @Override
    public String toString() {
        return "Merchandise: " + getName() + " - " + category + " - " + description + "\n";
    }
}
