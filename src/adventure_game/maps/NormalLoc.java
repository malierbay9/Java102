package adventure_game.maps;

import adventure_game.game.Player;

public abstract class NormalLoc extends Location{
    public NormalLoc(int id, Player player, String name) {
        super(id,player, name);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
