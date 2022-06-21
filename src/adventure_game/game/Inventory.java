package adventure_game.game;

import adventure_game.items.*;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private List<String> trophies = new ArrayList<String>();

    public Inventory() {
        this.weapon=new Fist();
        this.armor=new Leather();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public List<String> getTrophy() {
        return trophies;
    }
}
