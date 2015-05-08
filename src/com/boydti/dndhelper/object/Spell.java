package com.boydti.dndhelper.object;

public class Spell
{
    public final String name;
    public final byte level;
    public final SpellClass spellClass;
    public final School school;
    public final boolean ritual;
    public final Component[] components;
    public final Duration duration;
    public final String description;
    
    private int hash;

    public Spell(String name, byte level, SpellClass spellClass, School school, boolean ritual, Component[] components, Duration duration, String description)
    {
        this.name = name;
        this.level = level;
        this.spellClass = spellClass;
        this.school = school;
        this.ritual = ritual;
        this.components = components;
        this.duration = duration;
        this.description = description;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Spell) {
            return false;
        }
        return ((Spell) obj).name.equals(this.name);
    }
    
    @Override
    public int hashCode()
    {
        if (this.hash == 0) {
            this.hash = this.name.hashCode();
        }
        return this.hash;
    }
}
