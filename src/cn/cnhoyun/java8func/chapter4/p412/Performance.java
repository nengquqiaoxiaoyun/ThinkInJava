package cn.cnhoyun.java8func.chapter4.p412;

import cn.cnhoyun.java8func.chapter1.Artist;

import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Stream.concat;

/**
 * @author: huakaimay
 * @since: 2020-12-21
 */
public interface Performance {
    String getName();

    Stream<Artist> getMusicians();

    /**
     *
     */

//    default Stream<String> getAllMusicians() {
//        Optional
//                .ofNullable(getMusicians().flatMap(artist -> artist.getMembers()))
//                .map(artistStream -> artistStream.map(artist -> artist.getName()))
//                .orElse()
//    }

    default Stream<Artist> getAllMusicians() {
        return getMusicians()
                .flatMap(artist -> concat(Stream.of(artist), artist.getMembers()));
    }

    public static void main(String[] args) {
        P412_1 p412_1 = new P412_1();
        Stream<Artist> allMusicians = p412_1.getAllMusicians();
        allMusicians.forEach(allMusicianss -> System.out.println(allMusicianss.isSolo()));
    }
}
