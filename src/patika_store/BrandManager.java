package patika_store;

import patika_store.brands.*;

import java.util.Comparator;
import java.util.TreeSet;

public class BrandManager {
    TreeSet<Brand> brandList = new TreeSet<>(new Comparator<Brand>() {
        @Override
        public int compare(Brand o1, Brand o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });

    public BrandManager() {
        this.getBrandList().add(new Samsung());
        this.getBrandList().add(new Lenovo());
        this.getBrandList().add(new Apple());
        this.getBrandList().add(new Huawei());
        this.getBrandList().add(new Casper());
        this.getBrandList().add(new Asus());
        this.getBrandList().add(new HP());
        this.getBrandList().add(new Xiaomi());
        this.getBrandList().add(new Monster());
    }

    public TreeSet<Brand> getBrandList() {
        return brandList;
    }
}
