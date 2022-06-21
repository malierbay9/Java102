package adventure_game.game;

import adventure_game.chars.*;

import java.util.Scanner;

public class Player {
    private int damage;
    private int block;
    private int health;
    private int tempHealth;
    private int money;
    private String name;
    private String charName;
    private Inventory inventory;
    private Scanner input = new Scanner(System.in);

    Player(String name) {
        this.name = name;
        this.setInventory(new Inventory());
    }

    public int getTotalDamage(){
        return this.damage+this.getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getBlock() {
        return this.getInventory().getArmor().getBlock();
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health<0){
            health=0;
        }
        this.health = health;
    }

    public int getTempHealth() {
        return tempHealth;
    }

    public void setTempHealth(int tempHealth) {
        this.tempHealth = tempHealth;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void selectChar() {

        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("--------------------------------------");
        for (GameChar gameChar : charList) {
            System.out.println("ID : " + gameChar.getId() +
                    "\tKarakter : " + gameChar.getName() +
                    "\tHasar : " + gameChar.getDamage() +
                    "\tSağlık : " + gameChar.getHealth() +
                    "\tPara : " + gameChar.getMoney());
        }
        System.out.println("--------------------------------------");
        System.out.println("Lütfen bir karakter giriniz.");

        while (true) {
            int selectChar = input.nextInt();
            if (selectChar < 1 || selectChar > charList.length) {
                System.out.println("Geçerli seçim giriniz !");
                continue;
            } else {
                initPlayer(charList[selectChar - 1]);
                break;
            }
        }
    }

    public void initPlayer(GameChar gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setTempHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }

    public void printInfo(){
        System.out.println("Silahınız : "+this.inventory.getWeapon().getName()+
                "\t Zırhınız : "+this.inventory.getArmor().getName()+
                "\t Hasarı : " + this.getTotalDamage()+
                "\t\t Savunma : "+this.getBlock()+
                "\t Sağlık : " + this.getHealth() +
                "\t Para : " + this.getMoney());
    }
}
