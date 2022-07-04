package day11.task2.interfaces;

import day11.task2.heroes.Hero;

public interface Healer {
    public void healHimself();
    public void healTeammate(Hero hero);
}
