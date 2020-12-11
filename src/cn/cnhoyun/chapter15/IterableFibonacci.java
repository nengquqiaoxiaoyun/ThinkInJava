package cn.cnhoyun.chapter15;// generics/IterableFibonacci.java
// Adapt the Fibonacci class to make it Iterable

import java.util.Iterator;

public class IterableFibonacci
        implements Iterable<Integer> {

    private Fibonacci fibonacci = new Fibonacci();

    private int n;

    public IterableFibonacci(int count) {
        n = count;
    }

    public IterableFibonacci() {
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return fibonacci.get();
            }

            @Override
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (int i : new IterableFibonacci(18))
            System.out.print(i + " ");
    }
}
