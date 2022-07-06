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


        System.out.println(shaman);
        magician.magicalAttack(shaman);
        System.out.println(shaman);

        shaman.healHimself();
        System.out.println(shaman);

        warrior.physicalAttack(shaman);
        System.out.println(shaman);

        for (int i=0; i<5; i++) {
            warrior.physicalAttack(shaman);
        }

        System.out.println(shaman);


    }
}
