public abstract class Product implements DescriptionPrice{
    private int number;
    private String name;
    private String model;
    private String description;
    private double price;

    //Constructores
    public Product(){};

    public Product (int numero, String name, String model, String description, double price) {
        this.number =  numero;
        this.name = name;
        this.model = model;
        this.description = description;
        this.price = price;
    }

    //Setters and Getters

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Methods
    public abstract void printContent();
}
