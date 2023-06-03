package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public String getDescription(){
        String description = "This animal is mostly "
                + color + ". It has "
                + (numberOfPaws == 1 ? numberOfPaws + " paw" : numberOfPaws + " paws")
                + " and " + (hasFur ? "a " : "no ") +"fur.";
        System.out.println(description);
        return description;
    }

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
        this.getDescription();
    }


}
