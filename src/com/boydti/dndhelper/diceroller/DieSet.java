package com.boydti.dndhelper.diceroller;

import java.util.Arrays;
import java.util.LinkedList;

public class DieSet
{
    private LinkedList<Die> dice = new LinkedList<Die>();
    private int[] rolls;

    public DieSet(int numOfDie, int sides)
    {
        for(int i = 0; i < numOfDie; i++)
        {
            this.dice.add(new Die(sides));
        }

        this.rolls = new int[this.dice.size()];
    }

    public void rollSet()
    {
        int i = 0;
        for(Die die : this.dice)
        {
            this.rolls[i++] += die.roll();
        }
    }

    public int sum()
    {
        int sum = 0;
        for(int num : this.rolls)
        {
            sum += num;
        }
        return sum;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(int num : this.rolls)
        {
            sb.append(num + ", ");
        }

        return sb.substring(0, sb.length() - 2);
    }

    public void dropLowest()
    {
        Arrays.sort(this.rolls);
        int[] temp = this.rolls;
        this.rolls = new int[this.rolls.length - 1];
        for(int i = 0; i < this.rolls.length; i++)
        {
            this.rolls[i] = temp[1 + i];
        }
    }

    public void dropLowest(int toDrop)
    {
        Arrays.sort(this.rolls);
        int[] temp = this.rolls;
        this.rolls = new int[this.rolls.length - toDrop];
        for(int i = 0; i < this.rolls.length; i++)
        {
            this.rolls[i] = temp[toDrop + i];
        }
    }
}
