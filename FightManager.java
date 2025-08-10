import enemies.Enemy;
import items.Item;
import players.Player;
import items.ItemManager;
import java.util.List;
import java.util.Scanner;

public class FightManager {
    private int round = 1;

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean playerIsAlive(Player player){
        if (player.getChosenHero().getHealth() > 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean enemyIsAlive(List<Enemy> enemy){
        for (Enemy e: enemy){
            if (e.getHealth() > 0){
                return true;
            }
        }
        return false;
    }

    public boolean startFight(Scanner scanner, Player player, List<Enemy> enemies, ItemManager itemManager){

        int playerHealth = player.getChosenHero().getHealth();
        int playerAttack = player.getChosenHero().getHealth();
        int playerDefense = player.getChosenHero().getDefense();

        player.showBackpack();
        Item randomCloseWeapon = itemManager.chooseItemReward(scanner, player);





    }



}
