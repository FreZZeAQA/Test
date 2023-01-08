package Game;

abstract public class Warrior {
    protected String name;
    protected Weapon weapon;
    protected double hp;

    public Warrior(String name, Weapon weapon, double hp) {
        this.name = name;
        this.weapon = weapon;
        this.hp = hp;
    }

    void attack(Warrior warrior) {
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

}
