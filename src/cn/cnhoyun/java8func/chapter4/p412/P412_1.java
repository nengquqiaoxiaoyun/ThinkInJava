package cn.cnhoyun.java8func.chapter4.p412;

import cn.cnhoyun.java8func.chapter1.Artist;
import cn.cnhoyun.java8func.chapter1.SampleData;

import java.util.stream.Stream;

/**
 * @author: huakaimay
 * @since: 2020-12-21
 */
public class P412_1 implements Performance {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Stream<Artist> getMusicians() {
        return SampleData.threeArtists();
    }
}


