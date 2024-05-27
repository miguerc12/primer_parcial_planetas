package rodriguez.miguel.frutas;

public class fruit {
    private String name;
    private String description;
    private double price;
    private int image;

    public fruit(String name, String description, double price, int image) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }
}
