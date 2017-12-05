package pl.highflyers.szkolenia.java.basic;

/**
 * @author Andrzej.Miedzinski
 */

public class Tablice_09 {
    public static void main(String[] args)
    {
        int tablicaIntow[] = new int[10];
        tablicaIntow[0] = 1;

        for(int i = 0; i < tablicaIntow.length; i++)
        {
            System.out.println(i + " element tablicy ma wartosc " + tablicaIntow[i]);
        }

        /*
        int tablicaIntow = {10, 15, 20, 25, 30};
        for(int i = 0; i < tablicaIntow.length; i++)
        {
            System.out.println(i + " element tablicy ma wartosc " + tablicaIntow[i]);
        }
         */

        /*
        int[][] tablicaWielowymiarowa = new int[5][5];
        for(int i = 0; i < tablicaWielowymiarowa.length; i++)
        {
            for(int j = 0; j < tablicaWielowymiarowa[i].length; j++)
            {
                System.out.println("[ " + i + " ] [ " + j + " ] \t");
            }
            System.out.println();
        }

         */

        /*

        int[][] tablicaSzarpana = { {5, 10, 15} , {2, 4, 6, 8}, {3, 6, 9, 12, 15, 18, 21} }
        for(int i = 0; i < tablicaSzarpana.length; i++)
        {
            for(int j = 0; j < tablicaSzarpana[i].length; j++)
            {
                System.out.println("[ " + i + " ] [ " + j + " ] \t");
            }
            System.out.println();
        }
         */
    }
}
