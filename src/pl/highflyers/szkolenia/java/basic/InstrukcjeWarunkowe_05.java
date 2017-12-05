package pl.highflyers.szkolenia.java.basic;

import java.util.Scanner;

/**
 * @author Andrzej.Miedzinski
 */

public class InstrukcjeWarunkowe_05
{
    public static void main(String[] args)
    {
        /*
        if( wyrażenie typu boolean )
        {
            operacje do wykonania
        }
        */

        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        scanner.close();

        if(liczba <= 5)
        {
            System.out.println("Liczba jest rowna 5!");
        }

        /*
        if(liczba == 5)
        {
            System.out.println("Liczba jest rowna 5!");
        }
        else if(liczba == 4)
        {
            System.out.println("Liczba jest rowna 4!");
        }
        else
        {
            System.out.println("Liczba nie jest rowna 5 ani 4!");
        }
        */

        /*
        switch( wartosc zmienne do sprawdzenia - tylko typu Integer, int i String)
        {
        case wartosc:
            operacje

        case wartosc2:
            operacje

        break; // przerwanie sprawdzania

        default:
            operacje domyslne
        }
         */

    }
}
