package patika_store.products;


import patika_store.brands.Brand;

public abstract class Product {
    Brand brand;
    int id;
    int discPercent;
    int stockAmount;
    String name;
    int screenSize;
    int ram;
    double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(Brand brand, int id, int discPercent, int stockAmount, String name, int screenSize, int ram, double price) {
        this.brand = brand;
        this.id = id;
        this.discPercent = discPercent;
        this.stockAmount = stockAmount;
        this.name = name;
        this.screenSize = screenSize;
        this.ram = ram;
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDiscPercent() {
        return discPercent;
    }

    public void setDiscPercent(int discPercent) {
        this.discPercent = discPercent;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
