package cn.cnhoyun.java8func.chapter1;

import java.util.stream.Stream;

import static java.util.stream.Stream.concat;

public interface Performance {

    String getName();

    /**
     * 音乐家
     * @return
     */
    Stream<Artist> getMusicians();

    // TODO: test
    default Stream<Artist> getAllMusicians() {
        return getMusicians().flatMap(artist -> {
            return concat(Stream.of(artist), artist.getMembers());
        });
    }

}