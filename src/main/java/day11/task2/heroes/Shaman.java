package day11.task2.heroes;

import day11.task2.interfaces.Healer;
import day11.task2.interfaces.MagicAttack;

public class Shaman extends Hero implements Healer, MagicAttack {
    public Shaman() {
        physAtt = 10;
        physDef = 0.2;
        magicAtt = 15;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        if (health>HEALTH_MAX) {
            health = HEALTH_MAX;
        } else {health = health + 50;}
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + 30 >HEALTH_MAX) {
            hero.health = HEALTH_MAX;
        } else hero.health = hero.health + 30;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackDamage = magicAtt*(1 - magicDef);
        if (hero.health-attackDamage<HEALTH_MIN) {
            hero.health = HEALTH_MIN;
        } else {
            hero.health = (int) (hero.health - attackDamage);
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
