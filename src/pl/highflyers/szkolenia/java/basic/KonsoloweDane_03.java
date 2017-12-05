package pl.highflyers.szkolenia.java.basic;

import java.util.Scanner;

/**
 * @author Andrzej.Miedzinski
 */

public class KonsoloweDane_03
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double wartosc = scanner.nextDouble();

        System.out.println("Z konsoli:" + wartosc);

        scanner.close();
    }
}
