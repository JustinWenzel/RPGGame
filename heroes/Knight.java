package heroes;

public class Knight extends Hero {

    public Knight(String name, int health, int attack, int defense) {
        super(name, health, attack, defense);
    }

    @Override
    public String getHeroName() {
        return "Ritter";
    }
}
