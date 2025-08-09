package items;

public class HealthItem extends Item {
    private int health;

    public HealthItem(String name, int health) {
        super(name);
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "{ " + super.toString() + " Health=" + health + " }";
    }
}
