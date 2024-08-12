package BTVN_Collection;

import java.util.*;

public class songList {
    Song song = new Song();
    public Set<Song> songSet = new HashSet<>();

    public void addSong(Song song) {
        songSet.add(song);
    }

    public Song findSong(String title) {
        for (Song song : songSet) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public void timBaiHat(String artist) {
        for (Song song : songSet) {
            if (song.getArtist().equals(artist)) {
                System.out.println(song);
            }
        }
    }

    public void sapXep() {
        List<Song> sortedSongs = new ArrayList<>(songSet);
        sortedSongs.sort(Comparator.comparingInt(Song::getDuration));
        for (Song song : sortedSongs) {
            System.out.println(song);
        }
    }


}
