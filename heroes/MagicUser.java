package heroes;

public class MagicUser extends Hero {

    public MagicUser(String name, int health, int attack, int defense) {
        super(name, health, attack, defense);
    }

    @Override
    public String getHeroName() {
        return "Hexe";
    }
}