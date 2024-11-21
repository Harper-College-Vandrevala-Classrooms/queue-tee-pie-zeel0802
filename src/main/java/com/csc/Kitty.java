package com.csc;

public class Kitty implements Cutie {
    @Override
    public String description() {
        return "A playful kitten with soft fur.";
    }

    @Override
    public Integer cutenessRating() {
        return 10;
    }
}
