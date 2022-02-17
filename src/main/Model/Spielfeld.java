package main.Model;

import java.util.Arrays;

//Spielfeld Klasse
public class Spielfeld {

    private int[][] feld = null;

    //Spielfeld Konstruktor
    public Spielfeld(int x, int y) {
        feld = new int[x][y];

        for (int[] ints : feld) {
            Arrays.fill(ints, 0);

        }
    }
    //Setzen von Steine im Spielfeld
    public void Setzen(int spielerid, int spalte) {

        int x = feld.length - 1;

        boolean weitergehts = true;

        while (x >= 0 && weitergehts) {

            if (feld[x][spalte] == 0) {
                feld[x][spalte] = spielerid;
                weitergehts = false;
            }
            x--;
        }
        //Überprüfung falls falsch eingesetzt
        if (x < 0) {
            System.out.println("Der Stein konnte nicht gesetzt werden! Bitte versuchen Sie nochmal.");
        }
    }
    //Ausgabe vom Spielfeld
    public void Ausgabe() {

        for (int[] ints : feld) {
            for (int anInt : ints) {

                System.out.print("| "+anInt+" |");

            }
            System.out.println();
        }

    }

    //Unentschieden überprüfen (wenn alle Steine gesetzt sind)
    public boolean drawVoll() {

        return AnzahlGesSteine() == feld.length * feld[0].length;
    }
    //Anzahl der gesetzten Steine
    public int AnzahlGesSteine() {
        int countSteine = 0;
        for (int[] ints : feld) {
            for (int k=0; k<feld[k].length; k++) {
                if (ints[k] != 0) {
                    countSteine++;
                }
            }
        }

        return countSteine;
    }
    //Testen ob einsetzen in der Reihe möglich ist
    public boolean testeReihe(int spielerid) {
        boolean ret = false;

        if (AnzahlGesSteine() >= 7) {
            for (int i = 0; i < feld.length; i++) {
                for (int j = 0; j < feld.length; j++) {
                    if (testHoriz(i, j, spielerid) || testVert(i, j, spielerid) || testDiag(i, j, spielerid)) {
                        ret = true;
                    }//

                }
            }

        } else {
            return ret;
        }
        return ret;

    }

    //Testen ob einsetzen horizontal möglich ist
    public boolean testHoriz(int x, int y, int Spieler) {
        boolean ret = false;


        if (y + 3 < feld[x].length) {
            if (feld[x][y] == Spieler && feld[x][y+1] == Spieler && feld[x][y+2] == Spieler && feld[x][y+3] == Spieler) {
                ret = true;
            }
        }
        return ret;

    }
    //Testen ob einsetzen vertikal möglich ist
    public boolean testVert(int x, int y, int Spieler) {
        boolean ret = false;
        if (x + 3 < feld.length) {
            if (feld[x][y] == Spieler && feld[x+1][y] == Spieler && feld[x+2][y] == Spieler && feld[x+3][y] == Spieler) {
                ret = true;
            }
        }
        return ret;
    }
    //Testen ob einsetzen diagonal möglich ist
    public boolean testDiag(int x, int y, int Spieler) {
        boolean ret = false;
        if (x + 3 < feld.length && y + 3 < feld.length) {
            if (feld[x][y] == Spieler && feld[x+1][y+1] == Spieler && feld[x+2][y+2] == Spieler && feld[x+3][y+3] == Spieler) {
                ret = true;
            }
        }

        if (x - 3 >= 0 && y + 3 < feld.length) {
            if (feld[x][y] == Spieler && feld[x-1][y+1] == Spieler && feld[x-2][y+2] == Spieler && feld[x-3][y+3] == Spieler) {
                ret = true;
            }
        }
        return ret;
    }
}
