package Game;

public class Stormtrooper extends Warrior{


    public Stormtrooper(String name,double hp, Weapon weapon) {
        super(name, weapon, hp);
    }

    @Override
    void attack(Warrior warrior) {
        warrior.setHp(warrior.getHp() -getWeapon().getDamage());
        System.out.println(warrior.getHp());
    }

    @Override
    public String toString() {
        return "Stormtrooper\n" +
                "weapon=" + weapon +
                "\nhp=" + hp+"\n" ;
    }
}
