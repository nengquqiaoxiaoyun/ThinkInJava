package cn.cnhoyun.chapter5;

/**
 * @author: huakaimay
 * @since: 2020-12-04
 */
public class C5_5_1 {
    public static void main(String[] args) {
        // 不要创建Tank的引用，因为调用gc时，引用还在适用范围内，因此不会调用finalize
        // 如果想要它们被垃圾回收就把引用置零（null）
        Tank tank = new Tank(false);
        tank.pour();
        tank = null;
        new Tank(false).pour();
        // 强制执行finalize
        System.gc();
    }
}

/**
 * 11.
 *  * Create a class called Tank that can be filled
 *  * and emptied, with a termination condition that it
 *  * must be empty when the object is cleaned up.
 *  * Write a finalize() that verifies this termination
 *  * condition. In main(), test the possible
 *  * scenarios that can occur when you use Tank.
 */
class Tank {
    /**
     * true：满的
     * false：空的
     */
    private boolean isFull = false;

    void pour() {
        this.isFull = true;
    }

    public Tank(boolean isFull) {
        this.isFull = isFull;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize被调用");
        System.out.println("isFull: " + isFull);
        // 清理时，必须是"空"的状态
        if (isFull) {
            System.err.println("Err: bucket is full");
        }
        super.finalize();
    }
}