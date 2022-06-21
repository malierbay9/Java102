package adventure_game.maps;

import adventure_game.game.Player;
import adventure_game.items.*;

public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(2, player, "Eşya Dükkanı");
    }

    @Override
    public boolean onLocation() {
        Weapon[] weaponList = {new Gun(), new Sword(), new Rifle()};
        Armor[] armorList = {new LightArmor(), new MediumArmor(), new HeavyArmor()};
        System.out.println("------ Eşya Dükkanına hoşgeldiniz ! ------");
        boolean showMenu = true;

        while(showMenu){
            System.out.println("1- Silahlar");
            System.out.println("2- Zırhlar");
            System.out.println("3- Çıkış Yap.");
            System.out.print("Seçimin : ");
            int selectCase = input.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.println("Geçerli değer giriniz !");
                selectCase = input.nextInt();
            }
            switch (selectCase) {
                case 1:
                    System.out.println("--------Silahlar--------");
                    printWeapon(weaponList);
                    buyWeapon(weaponList);
                    break;

                case 2:
                    System.out.println("--------Zırhlar--------");
                    printArmor(armorList);
                    buyArmor(armorList);
                    break;

                case 3:
                    System.out.println("Bir daha bekleriz. :)");
                    showMenu=false;
                    break;
            }
        }
        return true;
    }

    public void printWeapon(Weapon[] weaponList) {
        for (Weapon weapon : weaponList) {
            System.out.println(weapon.getId() + "\t"
                    + weapon.getName() + "\tHasarı : "
                    + weapon.getDamage() + "\tÜcreti : "
                    + weapon.getPrice());
        }
        System.out.println("0 - Menüye Dön ");
    }


    public void printArmor(Armor[] armorList) {
        for (Armor armor : armorList) {
            System.out.println(armor.getId() + "\t"
                    + armor.getName() + "\tSavunma Değeri : "
                    + armor.getBlock() + "\tÜcreti : "
                    + armor.getPrice());
        }
        System.out.println("0 - Menüye Dön ");
    }


    public Weapon getWeaponByID(Weapon[] weaponList, int id) {
        return weaponList[id-1];
    }

    public Armor getArmorByID(Armor[] armorList, int id) {
        return armorList[id-1];
    }

    public void buyWeapon(Weapon[] weaponList){
        System.out.println("Almak istediğiniz silahı seçin :");
        int selectWeaponID = input.nextInt();

        while (selectWeaponID < 0 || selectWeaponID > weaponList.length) {
            System.out.println("Geçerli değer giriniz !");
            selectWeaponID = input.nextInt();
        }

        if(selectWeaponID!=0){
            Weapon selectedWeapon = getWeaponByID(weaponList, selectWeaponID);

            if (selectedWeapon != null) {

                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                }
                else {
                    //SATIN ALMA
                    System.out.println(selectedWeapon.getName() + " Silahını Satın Aldınız !");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan Paranız : " + this.getPlayer().getMoney());
                    System.out.println("Önceki Silahınız : "+this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Yeni Silahınız : "+this.getPlayer().getInventory().getWeapon().getName());
                }
            }
        }
    }

    public void buyArmor(Armor[] armorList){
        System.out.println("Almak istediğiniz zırhı seçin :");
        int selectArmorID = input.nextInt();

        while (selectArmorID < 0 || selectArmorID > armorList.length) {
            System.out.println("Geçerli değer giriniz !");
            selectArmorID = input.nextInt();
        }

        if(selectArmorID!=0){
            Armor selectedArmor = getArmorByID(armorList, selectArmorID);

            if (selectedArmor != null) {

                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                }
                else {
                    //SATIN ALMA
                    System.out.println(selectedArmor.getName() + " Silahını Satın Aldınız !");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan Paranız : " + this.getPlayer().getMoney());
                    System.out.println("Önceki Zırhınız : "+this.getPlayer().getInventory().getArmor().getName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Yeni Zırhınız : "+this.getPlayer().getInventory().getArmor().getName());

                }
            }
        }
    }

}
