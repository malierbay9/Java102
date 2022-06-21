package adventure_game.maps;

import adventure_game.game.Player;

import java.util.List;

public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(1, player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Güvenli Evdesiniz. ");
        this.getPlayer().setHealth(this.getPlayer().getTempHealth());
        System.out.println("Canınız yenilendi. ");
        printTrophy();
        if (isWon(this.getPlayer().getInventory().getTrophy())) {
            System.out.println("TEBRİKLER !!! OYUNU KAZANDIN !!!");
            System.exit(0);
        }
        return true;
    }

    public void printTrophy() {
        System.out.println();
        System.out.println("Toplanan Eşyalar : ");
        for (String a : this.getPlayer().getInventory().getTrophy()) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    boolean isWon(List<String> trophies) {
        if(this.getPlayer().getInventory().getTrophy().size()==3){
            return true;
        }
        else
            return false;
    }

}
