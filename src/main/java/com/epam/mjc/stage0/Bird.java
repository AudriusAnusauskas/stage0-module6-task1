package com.epam.mjc.stage0;

public class Bird extends Animal {
    private static String color = "blue";
    private static int numberOfPaws = 2;
    private static boolean hasFur = false;
    public Bird(){
        super(color, numberOfPaws, hasFur);

    }
    @Override
    public String getDescription(){
        String description = "This animal is mostly "
                + color + ". It has "
                + (numberOfPaws == 1 ? numberOfPaws + " paw" : numberOfPaws + " paws")
                + " and " + (hasFur ? "a " : "no ") +"fur. Moreover, it has 2 wings and can fly.";
        System.out.println(description);
        return description;
    }
}
