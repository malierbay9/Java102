package adventure_game.obstacles;

public abstract class Obstacle {
    private int id ;
    private int damage;
    private int health;
    private String name;
    private  int award;
    private int tempHealth;

    public Obstacle(int id, int damage, int health, String name,int award,int tempHealth) {
        this.setId(id);
        this.setDamage(damage);
        this.setHealth(health);
        this.setName(name);
        this.setAward(award);
        this.setTempHealth(tempHealth);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health<0) {
            health = 0;
        }
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public int getTempHealth() {
        return tempHealth;
    }

    public void setTempHealth(int tempHealth) {
        this.tempHealth = tempHealth;
    }
}
