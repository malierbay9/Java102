package adventure_game.maps;

import adventure_game.game.*;
import adventure_game.obstacles.*;

import java.util.List;
import java.util.Random;

public abstract class BattleLocation extends Location {
    private Obstacle obstacle;
    private String trophy;
    private int maxObstacleAmount;


    public BattleLocation(int id, Player player, String name, Obstacle obstacle, String trophy, int maxObstacleAmount) {
        super(id, player, name);
        this.setObstacle(obstacle);
        this.setTrophy(trophy);
        this.setMaxObstacleAmount(maxObstacleAmount);
    }

    @Override
    public boolean onLocation() {
        if ((!this.getPlayer().getInventory().getTrophy().isEmpty()) && checkList(this.getPlayer().getInventory().getTrophy())) {
            System.out.println("Burayı zaten tamamladınız !");
        } else {
            int obsAmount = obsGenerator();
            System.out.println("Şu an buradasınız --> " + this.getName());
            System.out.println("Dikkatli ol ! Burada " + obsAmount + " tane " + this.getObstacle().getName() + " yaşıyor !");
            //System.out.println(this.getObstacle().getDamage());
            System.out.println("<S>avaş veya <K>aç : ");
            String acceptCombat = input.next().toUpperCase();
            if (acceptCombat.equals("S")) {

                if (combat(obsAmount)) {
                    System.out.println(this.getName() + " daki tüm düşmanları yendiniz !");
                    if (checkTrophy()) {
                        this.getPlayer().getInventory().getTrophy().add(this.getTrophy());
                        System.out.println(this.getTrophy() + " Kazandınız !");
                    }
                    return true;
                }

            }

            if (this.getPlayer().getHealth() <= 0) {
                return false;
            }

        }
        return true;
    }

    public boolean combat(int obsAmount) {
        for (int i = 1; i <= obsAmount; i++) {
            this.getObstacle().setHealth(this.getObstacle().getTempHealth());
            if (this.getObstacle().getName().equals("Yılan")) {
                this.getObstacle().setDamage((int) Math.floor(Math.random() * 4) + 3);
            }
            playerStats();
            obsStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {

                System.out.println("<V>ur veya <K>aç :");
                String combatDecision = input.nextLine().toUpperCase();

                if (combatDecision.equals("V")) {
                    System.out.println("Siz vurdunuz !");
                    this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getObstacle().getHealth() > 0) {
                        System.out.println();
                        System.out.println(this.getObstacle().getName() + " Size Vurdu !");
                        int obsDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (obsDamage < 0) {
                            obsDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obsDamage);
                        afterHit();
                    }
                } else if (combatDecision.equals("K")) {
                    System.out.println("Kaçtın !");
                    return false;
                }
            }

            if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
                System.out.println("Düşmanı yendiniz !");
                System.out.println();
                award();
            } else {
                return false;

            }

        }
        return true;
    }


    public void afterHit() {
        System.out.println("Canınız : " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " ın Canı : " + this.getObstacle().getHealth());
        System.out.println("----------------------");
    }

    public void playerStats() {
        System.out.println("Oyuncu Değerleri : ");
        System.out.println("----------------------");
        System.out.println("Sağlık : " + this.getPlayer().getHealth());
        System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
        System.out.println("Savunma : " + this.getPlayer().getBlock());
        System.out.println("Para : " + this.getPlayer().getMoney());
        System.out.println();
    }

    public void obsStats(int i) {
        System.out.println(i + ". " + this.getObstacle().getName() + " Değerleri : ");
        System.out.println("----------------------");
        System.out.println("Sağlık : " + this.getObstacle().getHealth());
        System.out.println("Hasar : " + this.getObstacle().getDamage());
        System.out.println("Ödül : " + this.getObstacle().getAward());
        System.out.println();
    }

    public int obsGenerator() {
        Random r = new Random();
        return r.nextInt(this.getMaxObstacleAmount()) + 1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getTrophy() {
        return trophy;
    }

    public void setTrophy(String trophy) {
        this.trophy = trophy;
    }

    public int getMaxObstacleAmount() {
        return maxObstacleAmount;
    }

    public void setMaxObstacleAmount(int maxObstacleAmount) {
        this.maxObstacleAmount = maxObstacleAmount;
    }

    public boolean checkTrophy() {
        if (this.getTrophy().equals(""))
            return false;
        else
            return true;
    }

    public boolean checkList(List<String> trophyList) {
        for (String trophy : trophyList) {
            if (trophy.equals(this.getTrophy()))
                return true;
        }
        return false;
    }

    public abstract void award();

}
