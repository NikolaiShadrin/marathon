package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    public int year;
    private List<MusicArtist> members;


    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void printMembers() {
        System.out.println(members);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        for(MusicArtist members: a.getMembers()) {
            b.getMembers().add(members);
        }
        a.getMembers().clear();
    }
}
