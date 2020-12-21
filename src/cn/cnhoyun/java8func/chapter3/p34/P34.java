package cn.cnhoyun.java8func.chapter3.p34;

import cn.cnhoyun.java8func.chapter1.Album;
import cn.cnhoyun.java8func.chapter1.SampleData;
import cn.cnhoyun.java8func.chapter1.Track;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: huakaimay
 * @since: 2020-12-21
 */
public class P34 {


    /**
     * 找出专辑中所有时长超过60s的曲目
     *
     * @param albums
     */
    public Set<String> findLongTracks(List<Album> albums) {
        Set<String> trackNames = new HashSet<>();
        for (Album album : albums) {
            for (Track track : album.getTrackList()) {
                if (track.getLength() > 60) {
                    String trackName = track.getName();
                    trackNames.add(trackName);
                }
            }
        }

        return trackNames;
    }


    public static boolean length(Track track) {
        return track.getLength() > 60;
    }


    /**
     * 找出专辑中所有时长超过60s的曲目
     * 用Stream改进
     *
     * @param albums
     */
    public Set<String> findLongTracksStream(List<Album> albums) {

        Set<String> collect = albums.stream()
                .flatMap((album -> album.getTracks()))
                .filter(P34::length)
                .map(track -> track.getName())
                .collect(Collectors.toSet());

        return collect;
    }

    @Test
    public void test() {
        List<Album> albums = Arrays.asList(SampleData.aLoveSupreme, SampleData.manyTrackAlbum, SampleData.sampleShortAlbum);
        Set<String> longTracks = findLongTracksStream(albums);
        System.out.println(longTracks);
    }
}
