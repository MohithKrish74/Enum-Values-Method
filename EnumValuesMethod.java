package com.keyword;

public class EnumValuesMethod
{
    public enum Season {WINTER, SPRING, SUMMER, FALL}
    public static void main(String[] args)
    {
        System.out.println("The Seasons are: ");
        for(Season season : Season.values())
        {
            System.out.println(season);
        }
    }
}
