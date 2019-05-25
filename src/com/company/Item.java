package com.company;

public class Item {

    int itemHP, itemStrength, itemPrestige;
    String itemName;

    public Item(String itemName, int itemHP, int itemStrength, int itemPrestige ) {
        this.itemName = itemName;
        this.itemHP = itemHP;
        this.itemStrength = itemStrength;
        this.itemPrestige = itemPrestige;

    }

    Item[] startItems = new Item[3];
    Item Oettiflasche= new Item("Oettipulle",3,5,1);
    Item akimboFlasche = new Item("zwei zerbrochene Flaschen",1,2,6);
    Item wurfDose = new Item("Pfanddosen",1,2,6);
}

