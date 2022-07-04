package day11.task2.heroes;

import day11.task2.interfaces.PhysAttack;

public abstract class Hero implements PhysAttack {
    protected static final int HEALTH_MAX = 100;
    protected static final int HEALTH_MIN = 0;

    protected int health; //здоровье
    protected double physDef; //процент поглощения физического урона
    protected double magicDef; //процент поглощения магического урона
    protected int physAtt; //величина физической атаки
    protected int magicAtt; //величина магической атаки

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackDamage = physAtt*(1 - hero.physDef);
        if (hero.health-attackDamage<HEALTH_MIN) {
            hero.health = HEALTH_MIN;
        } else {
            hero.health = (int) (hero.health - attackDamage);

        }
    }


}