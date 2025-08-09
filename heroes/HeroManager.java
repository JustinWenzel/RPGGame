package heroes;

import heroes.Hero;

import java.util.ArrayList;
import java.util.List;

public class HeroManager{
    private List<Hero> allHeroes = new ArrayList<>();
    private List<Knight> allKnights = new ArrayList<>();
    private List<MagicUser> allMagicUsers = new ArrayList<>();

    public HeroManager(){
        loadAllHeroes();
    }


    public List<Hero> getAllHeroes(){
        return allHeroes;
    }

    public List<Knight> getAllKnights() {
        return allKnights;
    }

    public List<MagicUser> getAllMagicUsers() {
        return allMagicUsers;
    }

    public void loadKnights(){
        Knight Faron = new Knight("Faron", 200, 50, 20);

        allKnights.add(Faron);
    }

    public void loadMagicUsers(){
        MagicUser Elvira = new MagicUser("Elvira", 170, 70, 10);

        allMagicUsers.add(Elvira);
    }


    public void loadAllHeroes(){
        loadKnights();
        loadMagicUsers();

        allHeroes.addAll(allKnights);
        allHeroes.addAll(allMagicUsers);
    }


    public String showHeroes() {
        String result = "";
        int index = 1;

        for (Hero hero : allHeroes) {
            result += index + ") " + hero.toString()  + "\n"; //toString um ALLE Werte anzuzeigen. Sonste geht auch mit getName usw.
            index++;
        }

        return result;
    }

    //DER bestimmte Held aus der Liste
    public Hero selectHero(int heroChoice){
        if (heroChoice < 1 || heroChoice > allHeroes.size()) {
           return null; //Methode einbauen
        } else {
            return allHeroes.get(heroChoice - 1);
        }

    }

}
