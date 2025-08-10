import enemies.Enemy;
import players.Player;

import java.util.List;

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

    public boolean startFight(Player player, List<Enemy> enemies){




    }



}
