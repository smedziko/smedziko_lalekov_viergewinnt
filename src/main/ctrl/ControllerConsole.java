package main.ctrl;

import Controller.Spieler;
import Controller.Spielfeld;

import java.util.Scanner;

public class ControllerConsole {
    public static void main(String[] args) {

    }

    public static void initSpielmenue(int zeile, int spalte){
        Spielfeld sp = new Spielfeld(zeile, spalte);
        Spieler s1 = new Spieler();
        Spieler s2 = new Spieler();

        //Spieler, welcher an der Reihe ist
        Spieler SpieleranderReihe = s1;

        Scanner sc = new Scanner(System.in);


    }

    public static void initMenue(){

    }
}
