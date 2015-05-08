package com.boydti.dndhelper.object;

public class Component
{
    public final boolean verbal;
    public final boolean somatic;
    public final String material;

    public Component(boolean verbal, boolean somatic, String material)
    {
        this.verbal = verbal;
        this.somatic = somatic;
        this.material = material;
    }
}
