package cn.cnhoyun.chapter14.packagee06;

import java.util.Arrays;
import java.util.List;

/**
 * @author: huakaimay
 * @since: 2020-12-08
 */
public class HShape {

    boolean isHithlight = false;

    public  void setHithlight() {
        this.isHithlight = true;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "is highlight? : " +
                (isHithlight ? " highlight " : " normal ");
    }

    public static void main(String[] args) {
        List<HShape> hShapes = Arrays.asList(new HCricle(), new HSquare());
        for (HShape hShape : hShapes) {
            hShape.setHithlight();
            System.out.println(hShape);
        }

    }
}

class HCricle extends HShape{

}

class HSquare extends HShape{

}