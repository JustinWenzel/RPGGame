package items;


import players.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ItemManager {
    private List<Item> allItems = new ArrayList<>();
    private List<HealthItem> healingItems = new ArrayList<>();
    private List<Weapon> closeWeapons = new ArrayList<>();
    private List<Item> magicWeapons = new ArrayList<>();

    public ItemManager() {
        loadAllItems();
    }


    public List<Item> getAllItems() {
        return allItems;
    }

    public List<HealthItem> getHealingItems() {
        return healingItems;
    }

    public List<Weapon> getCloseWeapons() {
        return closeWeapons;
    }

    private void loadHealingItems() {
        HealthItem smallPotion = new HealthItem("Small healing potion", 50);
        HealthItem bigPotion = new HealthItem("Big healing potion", 150);

        healingItems.add(smallPotion);
        healingItems.add(bigPotion);
    }

    private void loadCloseWeapons() {

        Weapon defaultSword = new Weapon("Standard-Sword", 50, 1);
        Weapon thornGreatSword = new Weapon("Thorn-Greatsword", 100, 0.9);
        Weapon everFlameSword = new Weapon("Everflame-Sword", 130, 0.8);

        closeWeapons.add(defaultSword);
        closeWeapons.add(thornGreatSword);
    }

    private void loadMagicWeapons() {
        Weapon defaultStaff = new Weapon("Ancient-Staff", 80, 0.8);
        Weapon skullStaff = new Weapon("Skull-Staff", 130, 0.7);
        Weapon darkWroughtScepter = new Weapon("Darkrising-Staff", 160, 0.6);

        magicWeapons.add(defaultStaff);
        magicWeapons.add(skullStaff);
        magicWeapons.add(darkWroughtScepter);
    }

    //später wenn Rest läuft
    private void loadShields() {

    }


    public void loadAllItems() {
        loadHealingItems();
        loadCloseWeapons();
        loadMagicWeapons();

        allItems.addAll(healingItems);
        allItems.addAll(closeWeapons);
        allItems.addAll(magicWeapons);
    }

    public Item getRandomWeapon(Player player1) {
        String weaponChoice = player1.getChosenHero().getName();

        switch (weaponChoice) {
            case "Knight":
                for (Item owned : player1.getBackpack()) {
                    for (Item close : closeWeapons) {
                        if (owned.getName().equals(close.getName())) {
                            return owned;
                        }
                    }
                }
                int randomIndexKnight = ThreadLocalRandom.current().nextInt(closeWeapons.size());
                return closeWeapons.get(randomIndexKnight);

            case "MagicUser":
                for (Item owned : player1.getBackpack()) {
                    for (Item magic : magicWeapons) {
                        if (owned.getName().equals(magic.getName())) {
                            return owned;
                        }
                    }
                }
                int randomIndexMagic = ThreadLocalRandom.current().nextInt(magicWeapons.size());
                return magicWeapons.get(randomIndexMagic);

            default:

                int randomIndexDefault = ThreadLocalRandom.current().nextInt(closeWeapons.size());
                return closeWeapons.get(randomIndexDefault);
        }
    }

}
