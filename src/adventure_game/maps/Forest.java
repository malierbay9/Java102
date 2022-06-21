package adventure_game.maps;

import adventure_game.game.Player;
import adventure_game.obstacles.*;

public class Forest extends BattleLocation{
    public Forest(Player player) {
        super(4, player, "Orman", new Vampire(), "Odun",3);
    }

    @Override
    public void award() {
        System.out.println(this.getObstacle().getAward() + " para kazandınız !");
        this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
        System.out.println("Güncel Paranız : " + this.getPlayer().getMoney());
    }
}
