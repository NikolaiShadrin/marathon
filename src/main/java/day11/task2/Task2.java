package day11.task2;

import day11.task2.heroes.Magician;
import day11.task2.heroes.Paladin;
import day11.task2.heroes.Shaman;
import day11.task2.heroes.Warrior;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician  = new Magician();
        Shaman shaman = new Shaman();


        System.out.println(paladin); //проверил, что здоровье точно 100

        warrior.physicalAttack(paladin);
        System.out.println(paladin);

        paladin.physicalAttack(magician);
        System.out.println(magician);

        shaman.healTeammate(magician);
        System.out.println(magician);

        magician.magicalAttack(paladin);
        System.out.println(paladin);

        shaman.physicalAttack(warrior);
        System.out.println(warrior);

        paladin.healHimself();
        System.out.println(paladin);

        for (int i=0; i<5; i++ ) {
            warrior.physicalAttack(magician);
        }
        System.out.println(magician);

    }
}
