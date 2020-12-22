package cn.cnhoyun.java8func.chapter5;

import cn.cnhoyun.java8func.chapter1.Album;
import cn.cnhoyun.java8func.chapter1.Artist;
import cn.cnhoyun.java8func.chapter1.SampleData;
import org.junit.Test;

import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.Map;

/**
 * @author: huakaimay
 * @since: 2020-12-22
 */
public class GroupTest {

    @Test
    public void run() {
        List<Album> albumList = SampleData.albumList;
        Map<Artist, Long> collect = albumList.stream().collect(groupingBy(Album::getMainMusician, counting()));

        Map<Artist, List<String>> collect1 = SampleData.albumList
                .stream()
                .collect(groupingBy(Album::getMainMusician, mapping(Album::getName, toList())));


    }
}
