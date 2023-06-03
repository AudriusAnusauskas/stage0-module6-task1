package com.epam.mjc.stage0;

public class Dog extends Animal {
    private static String color = "brown";
    private static int numberOfPaws = 4;
    private static boolean hasFur = true;

    public Dog(){
        super(color, numberOfPaws, hasFur);
    }
}
