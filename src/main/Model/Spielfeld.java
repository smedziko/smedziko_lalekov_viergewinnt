package main.Model;

//Spielfeld Klasse
public class Spielfeld {
    //Spielfeld erstellen
    int[][] spielfeld = new int[6][7];
    //Spielsteine erstellen
    Spielstein[][] spielsteine = new Spielstein[6][7];
    //Zeile des Spielfeldes
    private int zeile;
    //Spalte des Spielfeldes
    private int spalte;

    /*
    Werfen-Methode
    Folgende Ausgaben sind möglich:
    -1 : Fehlwurf
     0 : Wurf OK
     1 : Spieler 1 gewonnen
     2 : Spieler 2 gewonnen
     Unentschieden: wenn alle Spielsteine verbraucht sind, wird das Spiel als Unentschieden gewertet
     */
    public int werfen(int spalte, int zeile, int spielsteine[][]) {
        int x = spielfeld.length - 1;
        boolean fortsetzen = true;
        while (x>=0 && fortsetzen==true)
        {
            if(spielfeld[x][spalte] == 0 )
            {
                spielfeld[x][spalte] = ;
                fortsetzen = false;
            }

            if(x<0){
                System.out.println("Stein konnte nicht gesetzt werden");
            }
        }
    }

    public int gewinnbedingung(int spielsteine[][]) {

    }
}
