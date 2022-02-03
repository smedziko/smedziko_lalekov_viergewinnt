package main.Model;

//Spielfeld Klasse
public class Spielfeld {
    int[][] spielfeld = new int[6][7];
    Spielstein[][] spielsteine = new Spielstein[6][7];
    private int zeile;
    private int spalte;

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
