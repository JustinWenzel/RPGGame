package items;

public class Weapon extends Item {
    private int attack;
    private double hitRate;

    public Weapon(String name, int attack, double hitRate) {
        super(name);
        this.attack = attack;
        this.hitRate = hitRate;
    }

    public int getAttack() {
        return attack;
    }

    public double getHitRate() {
        return hitRate;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHitRate(double hitRate) {
        this.hitRate = hitRate;
    }

    @Override
    public String toString() {
        return "{ " + super.toString() + " ATK=" + attack + " HITRATE=" + hitRate + " }";
    }
}
