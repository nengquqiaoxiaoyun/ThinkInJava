package cn.cnhoyun.java8func.chapter3.p39;

import cn.cnhoyun.java8func.chapter1.Artist;
import cn.cnhoyun.java8func.chapter1.SampleData;
import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 2. 迭代
 *
 * @author: huakaimay
 * @since: 2020-12-21
 */
public class P39_2 {

    /**
     * 将外部迭代改为内部迭代
     *
     * @param artists
     */
    public void iterate(List<Artist> artists) {
        int totalMemeber = 0;
        for (Artist artist : artists) {
            Stream<Artist> memeber = artist.getMembers();
            totalMemeber += memeber.count();
        }

        System.out.println(totalMemeber);

        // transfer
        int i = artists.stream()
                .map(artist -> artist.getMembers().count())
                .peek(System.out::println)
                .reduce(0l, Long::sum)
                .intValue();
        System.out.println(i);
        
    }

    @Test
    public void run() {
        List<Artist> threeArtists = SampleData.getThreeArtists();
        iterate(threeArtists);
    }

}
