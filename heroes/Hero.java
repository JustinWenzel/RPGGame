package heroes;


import items.Item;

import java.util.ArrayList;
import java.util.List;

//irgendwann Heromanager erstellen
public abstract class Hero {
    private String name;
    private int defaultHealth;
    private int defaultAttack;
    private int defaultDefense;

    public Hero(String name, int defaultHealth, int defaultAttack, int defaultDefense) {
        this.name = name;
        this.defaultHealth = defaultHealth;
        this.defaultAttack = defaultAttack;
        this.defaultDefense = defaultDefense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return defaultHealth;
    }

    public int getAttack() {
        return defaultAttack;
    }

    public int getDefense() {
        return defaultDefense;
    }

    public abstract String getHeroName();

    @Override
    public String toString() {
        return name + " { HP=" + defaultHealth +
                ", ATK=" + defaultAttack +
                ", DEF=" + defaultDefense + " }";
    }
}




