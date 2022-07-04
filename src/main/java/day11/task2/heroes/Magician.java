package day11.task2.heroes;

import day11.task2.interfaces.MagicAttack;

public class Magician extends Hero implements MagicAttack {

    public Magician() {
        physAtt = 5;
        physDef = 0;
        magicAtt = 20;
        magicDef = 0.8;

    }

    @Override
    public void magicalAttack(Hero hero) {
            double attackDamage = magicAtt*(1 - hero.magicDef);
            if (hero.health-attackDamage<HEALTH_MIN) {
                hero.health = HEALTH_MIN;
            } else {
                hero.health = (int) (hero.health - attackDamage);
            }
        }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}

