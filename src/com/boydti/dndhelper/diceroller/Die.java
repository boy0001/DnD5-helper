package com.boydti.dndhelper.diceroller;

import java.util.Random;

public class Die
{
    private int sides;

    public Die(int sides)
    {
        this.sides = sides;
    }

    public int roll()
    {
        Random roll = new Random();
        return roll.nextInt(this.sides) + 1;
    }
}
