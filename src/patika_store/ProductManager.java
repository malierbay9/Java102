package patika_store;

import patika_store.brands.*;
import patika_store.products.*;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    List<Phone> phoneList = new ArrayList<>();
    List<Notebook> notebookList = new ArrayList<>();

    public ProductManager() {
        //PHONE
        this.phoneList.add(new Phone(new Samsung(),1,10,10,"SAMSUNG GALAXY A51",6,6,3199,128,4000,"Siyah"));
        this.phoneList.add(new Phone(new Apple(),2,10,10,"iPhone 11 64 GB",6,6,7379,3046,3046,"Mavi"));
        this.phoneList.add(new Phone(new Xiaomi(),3,10,10,"Redmi Note 10 Pro 8GB",6,12,4012,128,4000,"Beyaz"));
        //NOTEBOOK
        this.notebookList.add(new Notebook(new Huawei(),1,10,10,"HUAWEİ Matebook 14",14,16,7000,512));
        this.notebookList.add(new Notebook(new Lenovo(),2,10,10,"LENOVO V14 IGL",14,8,3699,1024));
        this.notebookList.add(new Notebook(new Asus(),3,10,10,"ASUS Tf Gaming",15,32,8199,2048));
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public List<Notebook> getNotebookList() {
        return notebookList;
    }
}
