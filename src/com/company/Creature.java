package com.company;

public class Creature {




    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }




    private String name;


    private int level, hitpoints, strength, agility;






    /*public Creature(String ParName,String ParRole, int ParLevel, int ParExp, int ParHp, int ParStrengh, int ParAgility)
    {
        this.hitpoints = ParHp;
        this.role = ParRole;
        this.exp = ParExp;
        this.strength = ParStrengh;
        this.agility = ParAgility;
        this.name = ParName;
        this.level = ParLevel;
    }*/

    /*public Creature(String ParName)
    {
        this.name = ParName;
        this.level = STARTINGLEVEL;
        this.exp = 0;
    }*/



    /*public void statCheck()
    {
        if(this.getExp() > )
        {

        }
    }*/
}
