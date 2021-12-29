package com.codegym.animal;

import com.codegym.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "chicken: tuc-tac";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
