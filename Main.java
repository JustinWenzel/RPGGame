import enemies.EnemyManager;
import heroes.Hero;
import heroes.HeroManager;
import items.Item;
import items.ItemManager;
import players.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HeroManager heroManagerForGame = new HeroManager();
        EnemyManager enemyManagerForGame = new EnemyManager();
        FightManager fightManagerForGame = new FightManager();
        ItemManager itemManagerForGame = new ItemManager();

        System.out.println("Wähle deinen Helden:\n" + heroManagerForGame.showHeroes());
        int heroChoice = scanner.nextInt();

        Hero chosenHero = heroManagerForGame.selectHero(heroChoice);
        Player player1 = new Player(chosenHero);


        Item randomWeapon = itemManagerForGame.getRandomWeapon(player1);
        player1.getBackpack().add(randomWeapon);

        System.out.println(player1.getChosenHero().getName() + player1.showBackpack());





    }
    }
