package cn.cnhoyun.java8func.chapter1;

/**
 * 专辑中的一支曲目
 * @author richard
 */
public final class Track {

    /**
     * 曲目名
     */
    private final String name;
    /**
     * 曲目时长？？
     */
    private final int length;

    public Track(String name, int length) {
        this.name = name;
        this.length = length;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the length of the track in milliseconds.
     */
    public int getLength() {
        return length;
    }

    public Track copy() {
        return new Track(name, length);
    }

    @Override
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' +
                ", length=" + length +
                '}';
    }
}