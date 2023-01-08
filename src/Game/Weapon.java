package Game;

public enum Weapon {
    AK47(150), AWP(250), TANK(500);
    private final double damage;
    Weapon(double damage) {
        this.damage = damage;
    }
    public double getDamage() {
        return damage;
    }
}
