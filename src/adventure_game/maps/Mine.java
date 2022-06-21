package adventure_game.maps;

import adventure_game.game.Player;
import adventure_game.items.*;
import adventure_game.obstacles.Snake;

import java.util.Random;

public class Mine extends BattleLocation{
    public Mine(Player player) {
        super(6, player, "Maden", new Snake(), "", 6);
    }

    @Override
    public void award() {
        Weapon[] weapons={new Gun(),new Sword(),new Rifle()};
        Armor[] armors={new LightArmor(),new MediumArmor(),new HeavyArmor()};
        Random prizeChance= new Random();
        int prizeProb = prizeChance.nextInt(100);
        Random tierChance=new Random();
        int tierProb = tierChance.nextInt(100);
        System.out.println(prizeProb);
        System.out.println(tierProb);
        if(prizeProb<15){//Weapon
            if(tierProb<50){
                System.out.println("Tabanca Kazandın !");
                System.out.println("Kullanmak ister misin ? <E> ya da <H>");
                String itemDecision = input.next().toUpperCase();
                if (itemDecision.equals("E")){
                    this.getPlayer().getInventory().setWeapon(new Gun());
                }

            }
            else if(tierProb<80){
                System.out.println("Kılıç Kazandın !");
                System.out.println("Kullanmak ister misin ? <E> ya da <H>");
                String itemDecision = input.next().toUpperCase();
                if (itemDecision.equals("E")){
                    this.getPlayer().getInventory().setWeapon(new Sword());
                }
            }
            else{
                System.out.println("Tüfek Kazandın !");
                System.out.println("Kullanmak ister misin ? <E> ya da <H>");
                String itemDecision = input.next().toUpperCase();
                if (itemDecision.equals("E")){
                    this.getPlayer().getInventory().setWeapon(new Rifle());
                }
            }
        }
        else if(prizeProb<30){//Armor
            if(tierProb<50){
                System.out.println("Hafif Zırh Kazandın !");
                System.out.println("Kullanmak ister misin ? <E> ya da <H>");
                String itemDecision = input.next().toUpperCase();
                if (itemDecision.equals("E")){
                    this.getPlayer().getInventory().setArmor(new LightArmor());
                }
            }
            else if(tierProb<80){
                System.out.println("Orta Zırh Kazandın !");
                System.out.println("Kullanmak ister misin ? <E> ya da <H>");
                String itemDecision = input.next().toUpperCase();
                if (itemDecision.equals("E")){
                    this.getPlayer().getInventory().setArmor(new MediumArmor());
                }
            }
            else{
                System.out.println("Ağır Zırh Kazandın !");
                System.out.println("Kullanmak ister misin ? <E> ya da <H>");
                String itemDecision = input.next().toUpperCase();
                if (itemDecision.equals("E")){
                    this.getPlayer().getInventory().setArmor(new HeavyArmor());
                }
            }
        }
        else if(prizeProb<55){//Money
            if(tierProb<50){
                System.out.println(1+ " para kazandınız !");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 1);
                System.out.println("Güncel Paranız : " + this.getPlayer().getMoney());
            }
            else if(tierProb<80){
                System.out.println(5+ " para kazandınız !");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 5);
                System.out.println("Güncel Paranız : " + this.getPlayer().getMoney());
            }
            else{
                System.out.println(10+ " para kazandınız !");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 10);
                System.out.println("Güncel Paranız : " + this.getPlayer().getMoney());
            }
        }
        else{//BAŞ
            System.out.println("Hiçbir şey kazanamadın ! )");
        }
    }


}
