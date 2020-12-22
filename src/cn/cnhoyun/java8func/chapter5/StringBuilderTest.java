package cn.cnhoyun.java8func.chapter5;

import cn.cnhoyun.java8func.chapter1.Artist;
import cn.cnhoyun.java8func.chapter1.SampleData;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static java.util.stream.Collectors.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: huakaimay
 * @since: 2020-12-22
 */
public class StringBuilderTest {

    @Test
    public void run() {
        List<Artist> collect = SampleData.threeArtists().collect(Collectors.toList());
        StringBuilder builder = new StringBuilder("[");

        collect.forEach(artist -> {
            if (builder.length() > 1) {
                builder.append(", ");
            }
            builder.append(artist.getName());
        });
        builder.append("]");
        String strBuilder = builder.toString();
        System.out.println(strBuilder);

        Stream<Artist> artistStream = SampleData.threeArtists();

        String builder2 = artistStream
                .map(Artist::getName)
                .collect(joining(", ", "[", "]"));

        System.out.println(builder2);


        HashMap<String, String> map = new HashMap<>();
//        map.put("name", "zhangsan");
        map.computeIfAbsent("name", this::addKey);
        System.out.println(map);
    }

    public String addKey(String str) {
        return "str";
    }
}
