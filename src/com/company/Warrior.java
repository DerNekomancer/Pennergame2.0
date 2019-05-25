package com.company;

public class Warrior extends Role{
    private static final int STARTINGHITPOINTS = 7;
    private static final int STARTINGSTRENGTH = 3;
    private static final int STARTINGAGILITY = 2;
    private static final String ROLENAME = "Warrior";
    public Warrior(){
        setHitpoints(STARTINGHITPOINTS);
        setStrength(STARTINGSTRENGTH);
        setAgility(STARTINGAGILITY);
    }
}
