package patika_store;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Store store = new Store(new BrandManager(),new ProductManager());

        try {
            store.run();
        } catch (IOException e) {
            System.out.println("Hatalı Seçim Yaptınız !");
        }
    }
}
