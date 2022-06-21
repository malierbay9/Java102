package adventure_game.maps;

import adventure_game.game.Player;
import adventure_game.obstacles.Bear;

public class River extends BattleLocation{
    public River(Player player) {
        super(5, player, "Nehir", new Bear(), "Su",2);
    }

    @Override
    public void award() {
        System.out.println(this.getObstacle().getAward() + " para kazandınız !");
        this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
        System.out.println("Güncel Paranız : " + this.getPlayer().getMoney());
    }
}
