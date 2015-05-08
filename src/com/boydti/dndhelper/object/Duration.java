package com.boydti.dndhelper.object;

public class Duration
{
    public final int duration;
    public final DurationUnit unit;
    public final boolean concentration;

    public Duration(int duration, DurationUnit unit, boolean concentration)
    {
        this.duration = duration;
        this.unit = unit;
        this.concentration = concentration;
    }
}
