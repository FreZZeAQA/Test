package Game;

public class Infantryman extends Warrior {


    public Infantryman(String name,double hp, Weapon weapon) {
        super(name, weapon, hp);
    }
    @Override
    void attack(Warrior warrior) {
        warrior.setHp(warrior.getHp() -getWeapon().getDamage());
        System.out.println(warrior.getHp());
    }

    @Override
    public String toString() {
        return "Infantryman\n" +
                "weapon=" + weapon +
                "\nhp=" + hp + "\n";
    }
}

