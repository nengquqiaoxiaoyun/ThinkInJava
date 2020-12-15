package cn.cnhoyun.chapter19;

import static cn.cnhoyun.chapter19.Signal.*;

// enums/TrafficLight.java
// Enums in switch statements
// Define an enum type:
enum Signal {GREEN, YELLOW, RED,}

public class TrafficLight {
    Signal color = RED;

    public void change() {
        switch (color) {
            // Note you don't have to say Signal.RED
            // in the case statement:
            case RED:
                color = GREEN;
                break;
            case GREEN:
                color = YELLOW;
                break;
            case YELLOW:
                color = RED;
                break;
        }
    }

    @Override
    public String toString() {
        return "The traffic light is " + color;
    }

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight();
        for (int i = 0; i < 7; i++) {
            System.out.println(t);
            t.change();
        }
    }
}
