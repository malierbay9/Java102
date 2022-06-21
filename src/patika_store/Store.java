package patika_store;

import patika_store.brands.*;
import patika_store.products.*;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class Store {
    BrandManager brandManager;
    ProductManager productManager;

    public Store(BrandManager brandManager,ProductManager productManager) {
        this.brandManager = brandManager;
        this.productManager = productManager;

    }

    public void printBrands(){
        Iterator<Brand> itr = this.brandManager.getBrandList().iterator();
        while(itr.hasNext()){
            System.out.println("Markalarımız :");
            System.out.println("------------------------");
            System.out.println("-"+itr.next().getName());
        }
    }

    public void printNotebooks(){
        System.out.println("|ID| Ürün Adı               |Fiyat  |Marka  |Depolama   |Ekran   |RAM       |");
        for(Notebook notebook : this.productManager.getNotebookList()){
            System.out.println("|"+notebook.getId()+"| "+notebook.getName()+"               |"+notebook.getPrice()+"  |"+notebook.getBrand().getName()+"  |"+notebook.getDepositSpace()+"   |"+notebook.getScreenSize()+"   |"+notebook.getRam()+"       |");
        }
    }

    public void printPhones(){
        System.out.println("|ID| Ürün Adı               |Fiyat  |Marka  |Depolama   |Ekran   |Pil         |RAM    |Renk   |");
        for (Phone phone : this.productManager.getPhoneList()){
            System.out.println("|"+phone.getId()+"| "+phone.getName()+"               |"+phone.getPrice()+"  |"+phone.getBrand().getName()+"  |"+phone.getMemorySpace()+"   |"+phone.getScreenSize()+"   |"+phone.getBatteryPower()+"       |"+phone.getRam()+"     |"+phone.getColor()+"   ");;
        }
    }

    public void run() throws IOException {
        boolean out = true;
        while(out){
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1-Notebook İşlemleri");
            System.out.println("2-Cep Telefonu İşlemleri");
            System.out.println("3-Marka Listele");
            System.out.println("0-Çıkış Yap");

            Scanner input = new Scanner(System.in);
            int selection = input.nextInt();
            if(selection>=4){
                throw new IOException("Hatalı Seçim Yaptınız !");
            }
            System.out.println("Tercihiniz : "+selection);
            switch (selection){
                case 1 :
                    printNotebooks();
                    break;
                case 2:
                    printPhones();
                    break;
                case 3:
                    printBrands();
                    break;
                case 0 :
                    out = false;
                    input.close();
                    break;
            }
        }
    }
}
