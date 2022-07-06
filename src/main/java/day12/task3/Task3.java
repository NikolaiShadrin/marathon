package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        MusicBand band1 = new MusicBand("Ранетки",2008);
        MusicBand band2 = new MusicBand("Кино",1981);
        MusicBand band3 = new MusicBand("Иванушки",1995);
        MusicBand band4 = new MusicBand("Limp Bizkit",1994);
        MusicBand band5 = new MusicBand("Король и Шут",1988);
        MusicBand band6 = new MusicBand("Время истекло",2010);
        MusicBand band7 = new MusicBand("little Big",2013);
        MusicBand band8 = new MusicBand("Би-2",1988);
        MusicBand band9 = new MusicBand("Любэ",1989);
        MusicBand band10 = new MusicBand("Градусы",2008);
        MusicBand band11 = new MusicBand("Бумбокс",2004);


        List<MusicBand> musicBand = new ArrayList<>();

        musicBand.add(band1);
        musicBand.add(band2);
        musicBand.add(band3);
        musicBand.add(band4);
        musicBand.add(band5);
        musicBand.add(band6);
        musicBand.add(band7);
        musicBand.add(band8);
        musicBand.add(band9);
        musicBand.add(band10);
        musicBand.add(band11);


        System.out.println("Проверка кол-ва групп: "+musicBand.size());

        System.out.println(musicBand);
        Collections.shuffle(musicBand);
        System.out.println(musicBand);

        List<MusicBand> groupsAfter2000 = new ArrayList<>();

        for (MusicBand band: musicBand) {
            if (band.getYear()>2000) {
                groupsAfter2000.add(band);
            }
        }

        System.out.println(groupsAfter2000);

    }
}
