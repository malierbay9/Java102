package adventure_game.maps;

import adventure_game.game.Player;

import java.util.Scanner;

public abstract class Location {
    private int id;
    private Player player;
    private String name;
    public static Scanner input = new Scanner(System.in);


    Location(int id,Player player,String name){
        this.setId(id);
        this.player=player;
        this.name=name;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean onLocation();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
