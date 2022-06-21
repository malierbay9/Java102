package adventure_game.maps;

import adventure_game.game.*;
import adventure_game.obstacles.*;

public class Cave extends BattleLocation{
    public Cave(Player player) {
        super(3, player,"Mağara", new Zombie(), "Yemek",3);
    }

    @Override
    public void award() {
        System.out.println(this.getObstacle().getAward() + " para kazandınız !");
        this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
        System.out.println("Güncel Paranız : " + this.getPlayer().getMoney());
    }
}
