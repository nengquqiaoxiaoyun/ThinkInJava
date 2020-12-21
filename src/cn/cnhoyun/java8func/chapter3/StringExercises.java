package cn.cnhoyun.java8func.chapter3;


import cn.cnhoyun.java8func.chapter1.SampleData;
import cn.cnhoyun.java8func.chapter1.Track;

import java.util.*;
import java.util.stream.Stream;

public class StringExercises {

    // Question 6
    public static int countLowercaseLetters(String string) {
        return (int) string.chars()
                .filter(Character::isLowerCase)
                .count();
    }

    // Question 7
    public static Optional<String> mostLowercaseString(List<String> strings) {
        return strings.stream()
                .max(Comparator.comparingInt(StringExercises::countLowercaseLetters));
    }

    public static void main(String[] args) {
        int count = countLowercaseLetters("abcAVs");
        System.out.println(count);

        List<String> strings = Arrays.asList("abc123", "SDHLFAasss", "sdkfsjfwISAF");
        String s = mostLowercaseString(strings).get();
        System.out.println(s);

        Stream<Track> tracks = SampleData.aLoveSupreme.getTracks();
        IntSummaryStatistics intSummaryStatistics = tracks.mapToInt(track -> track.getLength())
                .summaryStatistics();
        double average = intSummaryStatistics.getAverage();
        long count1 = intSummaryStatistics.getCount();
        long sum = intSummaryStatistics.getSum();
        System.out.println("average: " + average + ", count: " + count1 + ", sum: " + sum);


    }

}