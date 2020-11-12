package lesson2.homework;

public class Product {
    private int id;
    private String name;
    private String manufacturerName;
    private int costPrice;

    public Product(int id, String name, String manufacturerName, int costPrice) {
        this.id = id;
        this.name = name;
        this.manufacturerName = manufacturerName;
        this.costPrice = costPrice;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public int getCostPrice() {
        return costPrice;
    }
}
