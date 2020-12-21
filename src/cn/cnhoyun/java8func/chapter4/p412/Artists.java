package cn.cnhoyun.java8func.chapter4.p412;

import cn.cnhoyun.java8func.chapter1.Artist;
import cn.cnhoyun.java8func.chapter1.SampleData;

import java.util.List;
import java.util.Optional;

/**
 * @author: huakaimay
 * @since: 2020-12-21
 */
public class Artists {

    private List<Artist> artists;

    public Artists(List<Artist> artists) {
        this.artists = artists;
    }

    public Optional<Artist> getArtist(int index) {
        if (index < 0 || index >= artists.size()) {
            return Optional.empty();
        }
        Artist artist = artists.get(index);
        return Optional.of(artist);
    }

    public String getArtistName(int index) {
        Optional<Artist> artist = getArtist(index);
        return artist.map(Artist::getName)
                .orElse("unknown");

    }

    public static void main(String[] args) {
        Artists artists = new Artists(SampleData.getThreeArtists());
        Optional<Artist> artist = artists.getArtist(2);
        System.out.println(artist);
        String artistName = artists.getArtistName(3);
        System.out.println(artistName);

    }
}
