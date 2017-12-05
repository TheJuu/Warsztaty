package pl.highflyers.szkolenia.java.basic;

/**
 * @author Andrzej.Miedzinski
 */

public class Rekurencja_11 {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        System.out.println(silnia(10));
    }

    public static int fibonacci(int n)
    {
        if(n == 0)
        {
            return 0;
        }

        if(n == 1)
        {
            return 1;
        }

        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static int silnia(int n)
    {
        if(n == 0)
        {
            return 1;
        }

        return n * silnia(n - 1);
    }
}


