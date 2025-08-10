package enemies;

import enemies.Enemy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class EnemyManager {
    private List<Enemy> allEnemies = new ArrayList<>();
    private List<Enemy> regularEnemies = new ArrayList<>();
    private List<Enemy> bossEnemies = new ArrayList<>();

    public EnemyManager(){
        loadAllEnemies();
    }

    public List<Enemy> getRegularEnemies() {
        return regularEnemies;
    }

    public void setRegularEnemies(List<Enemy> regularEnemies) {
        this.regularEnemies = regularEnemies;
    }

    public List<Enemy> getAllEnemies() {
        return allEnemies;
    }

    public void setAllEnemies(List<Enemy> allEnemies) {
        this.allEnemies = allEnemies;
    }

    public List<Enemy> getBossEnemies() {
        return bossEnemies;
    }

    public void setBossEnemies(List<Enemy> bossEnemies) {
        this.bossEnemies = bossEnemies;
    }

    public void loadRegularEnemies() {
        Enemy slime = new Enemy("Slime", 20, 10, 0);
        Enemy poision = new Enemy("Poision", 40, 20, 5);
        Enemy spider = new Enemy("Spider", 30, 15, 5);

        regularEnemies.add(slime);
        regularEnemies.add(poision);
        regularEnemies.add(spider);
    }

    public void loadBossEnemies() {
        Enemy unknownKnight = new Enemy("Unknown Knight", 400, 50, 20);
        Enemy giant = new Enemy("Giant", 500, 70, 30);

        bossEnemies.add(unknownKnight);
        bossEnemies.add(giant);
    }


    public void loadAllEnemies() {
        loadRegularEnemies();
        loadBossEnemies();

        allEnemies.addAll(regularEnemies);
        allEnemies.addAll(bossEnemies);
    }

    public List<Enemy> getEnemyOfWave() {
        double enemyChoice = ThreadLocalRandom.current().nextDouble(0.0, 1.0);
        int possibleEnemyCount = ThreadLocalRandom.current().nextInt(0, 4);
        List<Enemy> enemyOfWave = new ArrayList<>();

            if (enemyChoice >= 0.30) {
                for (int i = 0; i < possibleEnemyCount; i++) {
                    int randomEnemyIndex = ThreadLocalRandom.current().nextInt(regularEnemies.size());
                    Enemy randomEnemy = regularEnemies.get(randomEnemyIndex);
                    enemyOfWave.add(randomEnemy);
                }

            } else {
                int randomEnemyIndex = ThreadLocalRandom.current().nextInt(bossEnemies.size());
                Enemy randomEnemy = bossEnemies.get(randomEnemyIndex);
                enemyOfWave.add(randomEnemy);

            }
        return enemyOfWave;
        }

    }

