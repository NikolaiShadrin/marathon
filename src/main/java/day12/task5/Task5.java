package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> member1 = new ArrayList<>();
        member1.add(new MusicArtist("Васька дэ Гамма", 1991));
        member1.add(new MusicArtist("Djimi Neitron", 1993));
        member1.add(new MusicArtist("Brat 2", 1994));

        MusicBand band1 = new MusicBand("Пляски", 2022, member1);

        List<MusicArtist> member2 = new ArrayList<>();
        member2.add(new MusicArtist("Gosha Kychenko", 1899));
        member2.add(new MusicArtist("Goshan", 1898));

        MusicBand band2 = new MusicBand("Songs", 2002, member2);

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();





    }
}
