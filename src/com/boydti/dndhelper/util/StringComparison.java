package com.boydti.dndhelper.util;

import java.util.Arrays;
import java.util.Comparator;

import com.boydti.dndhelper.object.Spell;

public class StringComparison
{
    public static int getLevenshteinDistance(String str1, String str2)
    {
        final int[][] distance = new int[str1.length() + 1][str2.length() + 1];

        for(int i = 0; i <= str1.length(); i++)
        {
            distance[i][0] = i;
        }
        for(int j = 1; j <= str2.length(); j++)
        {
            distance[0][j] = j;
        }

        for(int i = 1; i <= str1.length(); i++)
        {
            for(int j = 1; j <= str2.length(); j++)
            {
                distance[i][j] = minimum(distance[i - 1][j] + 1, distance[i][j - 1] + 1, distance[i - 1][j - 1]
                        + ((str1.charAt(i - 1) == str2.charAt(j - 1)) ? 0 : 1));
            }
        }

        return distance[str1.length()][str2.length()];
    }

    private static int minimum(int a, int b, int c)
    {
        return Math.min(Math.min(a, b), c);
    }

    public static Spell[] sortSpells(Spell[] myList, String input)
    {
        Arrays.sort(myList, new Comparator<Spell>()
        {
            @Override
            public int compare(Spell o1, Spell o2)
            {
                return 0; //TODO have this compare spells
            }
        });
        return null;

    }

}
