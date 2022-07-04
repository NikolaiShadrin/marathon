package day11.task2.heroes;


public class Warrior extends Hero {

    public Warrior() {
        physAtt = 30;
        physDef = 0.8;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
