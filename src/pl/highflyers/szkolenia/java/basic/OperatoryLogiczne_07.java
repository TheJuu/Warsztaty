package pl.highflyers.szkolenia.java.basic;

import java.util.Scanner;

/**
 * @author Andrzej.Miedzinski
 */

public class OperatoryLogiczne_07
{
    public static void main(String[] args)
    {
        /*
        Operatowy porownania
        = rowne
        > wieksze
        < mniejsze
        >= wieksze lub rowne
        <= mniejsze lub rowne
        != nierowne
         *
         * Operatory laczenia warunkow
         * && koniunkcja (spojnik i)
         * || alternatywa (spoknij lub)
         * ! negacja
         */

        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        scanner.close();

        if(liczba != 5)
        {
            System.out.println("Liczba jest rozna od 5.");
        }
        else if(liczba <= 4)
        {
            System.out.println("Liczba jest mniejsza lub rowna 4.");
        }
        else
        {
            System.out.println("Zaden z powyzszych warunkow nie zostal spelniony.");
        }

        /*
        Obie grupy operatorow
        {
            System.out.println("Liczba jest wieksza lub rowna 5 i jednoczesnie mniejsza lub rowna 10.");
        }
        else if(!(liczba !=4 && liczba != 11))
        {
            System.out.println("Liczba jest rowna 4 i jednoczesnie rowna 11");
        }
        else
        {
            System.out.println("Zaden z powyzszych warunkow nie zostal spelniony.");
        }
         */
    }
}
