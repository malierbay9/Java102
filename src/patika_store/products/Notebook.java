package patika_store.products;


import patika_store.brands.Brand;

public class Notebook extends Product{
    int depositSpace;

    public Notebook(Brand brand, int id, int discPercent, int stockAmount, String name, int screenSize, int ram, double price, int depositSpace) {
        super(brand, id, discPercent, stockAmount, name, screenSize, ram, price);
        this.depositSpace = depositSpace;
    }

    public int getDepositSpace() {
        return depositSpace;
    }

    public void setDepositSpace(int depositSpace) {
        this.depositSpace = depositSpace;
    }
}
