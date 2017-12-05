package pl.highflyers.szkolenia.java.basic;

/**
 * @author Andrzej.Miedzinski
 */

public class Metody_10 {
    public static void main(String[] args) {
        /*
        public static [typ zwracany] [nazwa metody] ( [zestaw argumentow] )
        {

        }
         */

        System.out.print(zwrocLiczbe());
    }

    public static int zwrocLiczbe()
    {
        int zwracanaLiczba = 5;
        return zwracanaLiczba;
    }

    public static int zwrocLiczbe(int liczba)
    {
      return liczba;
    }

    public static int zwrocLiczbe(String liczba)
    {
        return Integer.parseInt(liczba);
    }

    public static void wypiszLiczby()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println(i);
        }
    }

    public static void wypiszInneLiczby()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println(i);

            if(i == 4)
            {
                return;
            }
        }
    }
}