package pl.highflyers.szkolenia.java.basic;

/**
 * @author Andrzej.Miedzinski
 */
public class TypyPodstawowe_02 {

    public static void main(String[] args)
    {
        byte zmiennaTypuByte = 1; // pojedynczy bajt
        boolean zmiennaTypuBoolean = true; // typ logiczny
        char zmiennaTypuChar = 'a'; // pojedynczy znak
        int zmiennaTypuInteger = 3214; // od -2147483648 do 2147483647
        long zmiennaTypuLong = 999999999L; //  -9223372036854775808 do 9223372036854775807
        float zmiennaTypuFloat = 3.14f;
        double zmiennaTypuDouble = 3.14d; //  4.9^-324 do 1.7976931348623157^308

        System.out.println("Byte: " + zmiennaTypuByte);
        System.out.println("Boolean: " + zmiennaTypuBoolean);
        System.out.println("Character: " + zmiennaTypuChar);
        System.out.println("Integer: " + zmiennaTypuInteger);
        System.out.println("Long: " + zmiennaTypuLong);
        System.out.println("Float: " + zmiennaTypuFloat);
        System.out.println("Double: " + zmiennaTypuDouble);
    }

}
