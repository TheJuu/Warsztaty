package pl.highflyers.szkolenia.java.basic;

import java.util.Scanner;

/**
 * @author Andrzej.Miedzinski
 */

public class Petle_08
{
    public static void main(String[] args)
    {
        int liczba = 1;

        /*
        liczba++; // postinkrementacja i = i + 1
        ++liczba; // preinkrementacja
        liczba--; // postdekrementacja i = i - 1
        --liczba; // predekrementacja
         */

        System.out.println(liczba++);
        System.out.println(++liczba);

        /*
        do
        {
            operacje
        }
        while(wyrazenie typu boolean);


        Scanner scanner = new Scanner(System.in);
        int wartosc = scanner.nextInt();
        scanner.close();

        do
        {
            System.out.println("Liczba = " + wartosc);
        }
        while(liczba++ < 20);
         */

        /*
        while( wyrazenie typu boolean)
        {
            operacje
        }

        Scanner scanner = new Scanner(System.in);
        int wartosc = scanner.nextInt();
        scanner.close();

        while(liczba++ < 20)
        {
            System.out.println("Liczba = " + wartosc);
        }
         */

        /*

        for( wyrazenie typu boid; wyrazenie typu boolean; wyrazenie typu void)
        {
            operacje
        }

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Liczba: " + i);
        }

        for(int i = 0; i < 5; )
        {
            System.out.println("Liczba: " + i);
            i++;
        }

        int i = 0;
        for( ; i < 5; )
        {
            System.out.println("Liczba: " + i);
            i++;
        }

        for(;;)
        {
            System.out.println("Nieskonczona petla");
        }

         */
    }
}
