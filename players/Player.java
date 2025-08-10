package players;

import heroes.Hero;
import items.Item;

import java.util.ArrayList;
import java.util.List;

public class Player {
    Hero chosenHero;
    private List<Item> backpack = new ArrayList<>();

    public Player(Hero chosenHero) {
        this.chosenHero = chosenHero;

    }


    public Hero getChosenHero() {
        return chosenHero;
    }

    public void setChosenHero(Hero chosenHero) {
        this.chosenHero = chosenHero;
    }

    public List<Item> getBackpack() {
        return backpack;
    }

    public void setBackpack(List<Item> backpack) {
        this.backpack = backpack;
    }

    public String showBackpack(){
        String result = " ";
        int index = 1;


        for (Item item:backpack){
            result += "Your Inventory: " + index + ") " + item.toString();
            index++;
        }
        return result;
    }

}


