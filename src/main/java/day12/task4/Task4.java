package day12.task4;

public class Task4 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Певуны",2022);
        MusicBand band2 = new MusicBand("Пой душа моя", 2022);

        band1.members.add("Василий Непомнящий");
        band1.members.add("Касапея Помнящая");

        band2.members.add("Эдуард Суровый");
        band2.members.add("Петр Покладистый");

        band1.transferMembers(band1, band2);

        band1.printMembers();
    }
}
