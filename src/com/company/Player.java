package com.company;

public class Player extends Creature{
    private static final int STARTINGLEVEL = 1;
    private Role role;
    private int exp=0;

    public Player (String name, Role role){
        this.setLevel(STARTINGLEVEL);
        addStats();
    }

    private void addStats() {
        setAgility(role.getAgility());
        setHitpoints(role.getHitpoints());
        setStrength(role.getStrength());
    }

    public int getExp() {return exp;}

    public void setExp(int xp) {this.exp = xp;}

    public Role getRole() {
        return role;
    }

    public String playerStatus()
    {
        String properties = "";
        properties += "Playername: " + this.getName() + ", "+ "Role: " + this.getRole() + ", " + "Level: "+ (this.getLevel()) + ", " + "Exp: " + (this.getExp()) + " Hitpoints: " + Integer.toString(this.getHitpoints())+", "
                + "Strength: " + (this.getStrength())+ ", " + "Agility: " + (this.getAgility())  ;
        return properties;
    }
}
