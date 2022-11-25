package spil;

import gui_fields.*;
import gui_main.GUI;
import our_fields.*;
import our_fields.GUI_Start;

import javax.swing.*;
import java.awt.*;

public class Spil {
    public static void main(String[] args) {
        
        Spiller spiller1 = new Spiller("Spiller1",1000,0);
        Spiller spiller2 = new Spiller("Spiller2",1000,0);
        //Indsætter felter i felt arrayet
        GUI_Custom[] fields = istantiererFelter();
        //opreter et nyt gui object der indeholder felterne fra arrayet og en baggrundsfarve
        GUI gui = new GUI(fields,Color.GRAY);
        //opretter mine to spillere
        spiller1.tilføjspillerGui(gui);
        spiller2.tilføjspillerGui(gui);
        while(true) {
            spiller1.spil(gui, fields);
            spiller2.spil(gui, fields);


        }

    }
    //method that istantierer all fields
    public  static GUI_Custom[] istantiererFelter()
    {
        GUI_Custom gStart = new our_fields.GUI_Start(Color.pink, Color.cyan, "Start", "", "This is the start field");
        GUI_Custom gEmpty =  new GUI_Start(Color.red, Color.cyan, "", "", "This field isnt reacherble");
        GUI_Custom gTower = new GUI_Tower(Color.ORANGE, Color.cyan, "Tower", "", "This is a good tower you gain +250 balance");
        GUI_Custom gCrater = new GUI_Crater(Color.BLUE, Color.CYAN, "Crater", "", "You fell into a crater you need to pay to get out -100 balance");
        GUI_Custom gPalaceGates = new GUI_PalaceGates(Color.yellow, Color.CYAN, "Palace Gates ", "", "You arrived at the Palace Gates you recived +100 balance");
        GUI_Custom gColdDesert = new GUI_ColdDessert(Color.darkGray, Color.cyan, "Cold Desert", "", "This is a cold desert you lose -20 balance");
        GUI_Custom gWalledCity = new GUI_WalledCity(Color.pink, Color.cyan, "Walled City", "", "This is a safe walled city you get +180 balance");
        GUI_Custom gMonastery = new GUI_Monastery(Color.WHITE, Color.cyan, "Monastery", "", "This is a peacefull place you will not gain or lose balance");
        GUI_Custom gBlackCave = new GUI_BlackCave(Color.black, Color.cyan, "Black Cave", "", "You get lost -70 balance");
        GUI_Custom gHutsInTheMountain = new GUI_HutsInTheMountin(Color.green, Color.cyan, "Huts In The Mountain", "", "The Huts are safe you gain +60 blance");
        GUI_Custom gTheWerewall = new GUI_TheWerewall(Color.RED, Color.cyan, "The WereWall", "", "Its a dangerous place you lose -80 balance but gain a ekstra turn");
        GUI_Custom gThePit = new GUI_ThePit(Color.lightGray, Color.cyan, "The Pit", "", "You fall into the pit -50 balance");
        GUI_Custom gGoldmine = new GUI_Goldmine(Color.yellow, Color.cyan, "Goldmine", "", "You found a goldmine +650 balance");
        GUI_Custom[] fields = {gStart,gEmpty,gTower,gCrater,gPalaceGates,gColdDesert,gWalledCity,gMonastery,gBlackCave,gHutsInTheMountain,gTheWerewall,gThePit,gGoldmine};
       return (fields);
    }



}
