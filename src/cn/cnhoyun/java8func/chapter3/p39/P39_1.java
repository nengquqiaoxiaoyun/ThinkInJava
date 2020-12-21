package cn.cnhoyun.java8func.chapter3.p39;

import cn.cnhoyun.java8func.chapter1.Album;
import cn.cnhoyun.java8func.chapter1.Artist;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static cn.cnhoyun.java8func.chapter1.SampleData.*;
import static java.util.stream.Collectors.*;

/**
 * 练习题 1.常用流操作
 *
 * @author: huakaimay
 * @since: 2020-12-21
 */
public class P39_1 {

    /**
     * 编写一个求和函数，计算流中所有数之和
     */
    int addUp(Stream<Integer> numbers) {
        // numbers.flatMapToInt(IntStream::of).sum();
        return numbers.reduce((acc, ele) -> acc + ele).get();
    }

    /**
     * 编写一个函数，返回一个字符串列表，其中包含艺术家的姓名和国籍
     *
     * @param artistList
     * @return
     */
    List<String> getNameAndNationality(List<Artist> artistList) {
        return artistList.stream()
                .map(artist -> artist.getName() + ": " + artist.getNationality())
                .collect(toList());
    }

    /**
     * 编写一个函数，返回一个字符串列表，其中包含艺术家的姓名和国籍
     */
    public static List<String> getNamesAndOrigins(List<Artist> artists) {
        return artists.stream()
                .flatMap(artist -> Stream.of(artist.getName(), artist.getNationality()))
                .collect(toList());
    }

    /**
     * 编写一个函数，返回一个由最多包含三首歌曲的专辑组成的列表
     *
     * @param albums
     * @return
     */
    List<Album> getThreeTracksMax(List<Album> albums) {

        return albums.stream()
                .filter(album -> album.getTrackList().size() <= 3)
                .collect(toList());
    }


    @Test
    public void run() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        integers.stream().mapToInt(Integer::intValue);
        int i = addUp(integers.stream());
        System.out.println(i);

        List<Artist> threeArtists = getThreeArtists();
        List<String> nameAndNationality = getNameAndNationality(threeArtists);
        System.out.println(nameAndNationality);

        List<String> namesAndOrigins = getNamesAndOrigins(threeArtists);
        System.out.println(namesAndOrigins);

        List<Album> albumList1 = albumList;
        List<Album> threeTracksMax = getThreeTracksMax(albumList1);
        threeTracksMax.forEach(System.out::println);
    }

}
