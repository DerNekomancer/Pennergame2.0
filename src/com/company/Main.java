package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        String playerClass = null;
        Creature benlodin = new Creature("test");
        //Creature gooby = new Creature("Gooby", 1, 0,10, 10, 5 );
        //System.out.println(gooby.playerStatus());
        System.out.println("Oi Penner, we need cha, quick choose a class.");
        System.out.print("Warrior \n");
        System.out.print("Assassin \n");
        System.out.print("Archer \n");
        Scanner mainScan = new Scanner(System.in);
        playerClass = mainScan.nextLine();
        if (playerClass.equals("Warrior") || playerClass.equals("Assassin") || playerClass.equals("Archer")) {

                System.out.println("good one entered");
        } else {
                System.out.println("C'mon dude, choose a valid class okay?");
            }


            System.out.println("Next tell me your name.");
            Scanner mainScan2 = new Scanner(System.in);
            if(playerClass.equals("Warrior")) //add classes for each Role, makes everything more simpler
            {
                /*benlodin.setName(mainScan2.nextLine()); // "Warrior", 1, 0, 7, 3, 2);
                benlodin.setRole("Warrior");
                benlodin.setHitpoints(7);
                benlodin.setStrength(3);
                benlodin.setAgility(2);*/
                Warrior benlodin = new Warrior();
            }
            else if(playerClass.equals("Assassin"))
            {
                benlodin.setName(mainScan2.nextLine()); //; "Assassin", 1, 0, 7, 3, 2);
                benlodin.setRole("Assassin");
                benlodin.setHitpoints(5);
                benlodin.setStrength(1);
                benlodin.setAgility(6);

            }

            else if(playerClass.equals("Archer"))
            {
                benlodin.setName(mainScan2.nextLine()); // "Warrior", 1, 0, 7, 3, 2);
                benlodin.setRole("Warrior");
                benlodin.setHitpoints(6);
                benlodin.setStrength(2);
                benlodin.setAgility(4);

            }

            else
            {
                benlodin.setName(mainScan2.nextLine()); // "Warrior", 1, 0, 7, 3, 2);
                benlodin.setRole("Warrior");
                benlodin.setHitpoints(7);
                benlodin.setStrength(3);
                benlodin.setAgility(2);

            }

            System.out.println(benlodin.playerStatus());


        /*Scanner myScanner = new Scanner(System.in);
        System.out.println("Put name!");
        String username = myScanner.nextLine();
        if(username.equals("kek")){
            System.out.println("kek");
        }
        System.out.println("Username: " + username);*/
        }






}
