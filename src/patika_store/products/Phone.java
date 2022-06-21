package patika_store.products;


import patika_store.brands.Brand;

public class Phone extends Product{
    int memorySpace;
    int batteryPower;
    String color;

    public Phone(Brand brand, int id, int discPercent, int stockAmount, String name, int screenSize, int ram, double price, int memorySpace, int batteryPower, String color) {
        super(brand, id, discPercent, stockAmount, name, screenSize, ram, price);
        this.memorySpace = memorySpace;
        this.batteryPower = batteryPower;
        this.color = color;
    }

    public int getMemorySpace() {
        return memorySpace;
    }

    public void setMemorySpace(int memorySpace) {
        this.memorySpace = memorySpace;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
