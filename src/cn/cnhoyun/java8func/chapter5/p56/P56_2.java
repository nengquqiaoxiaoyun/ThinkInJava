package cn.cnhoyun.java8func.chapter5.p56;

import cn.cnhoyun.java8func.chapter1.Artist;
import cn.cnhoyun.java8func.chapter1.SampleData;
import org.junit.Test;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 2. 收集器
 *
 * @author: huakaimay
 * @since: 2020-12-22
 */
public class P56_2 {

    @Test
    public void a() {
        Comparator<Artist> artistComparator = Comparator.comparingInt(artist -> artist.getName().length());

        Optional<Artist> collect = SampleData.threeArtists()
                .collect(Collectors.maxBy(artistComparator));
        System.out.println(collect);

        Optional<Artist> reduce = SampleData.threeArtists()
                .reduce(((artist, artist2) ->
                        artistComparator.compare(artist, artist2) >= 0 ? artist : artist2
                ));

        System.out.println(reduce);
    }

    /**
     * 计算每个名字出现的次数 用map接收
     */
    @Test
    public void b() {
        Stream<String> names = Stream.of("John", "Paul", "George", "John", "Paul", "John");

        Map<String, Long> collect = names.collect(Collectors.groupingBy(name -> name, Collectors.counting()));
        System.out.println(collect);

    }
}
