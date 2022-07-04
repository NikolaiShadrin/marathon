package day11.task2.heroes;

import day11.task2.interfaces.Healer;

public class Paladin extends Hero implements Healer {
    public Paladin() {
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
    }


    @Override
    public void healHimself() {
        if (health>HEALTH_MAX) {
            health = HEALTH_MAX;
        } else {health = health + 25;}
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health+10>HEALTH_MAX) {
            hero.health = HEALTH_MAX;
        } else hero.health = hero.health + 10;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
