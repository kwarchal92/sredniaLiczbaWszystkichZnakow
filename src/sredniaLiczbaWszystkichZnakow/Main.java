package sredniaLiczbaWszystkichZnakow;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args)
    {
        String zdanie = "zeby kozka nie skakala to by nozki nie zlamala";

        System.out.println("w nastepujacym zdaniu: " + zdanie + ".");

        String[] zdanie1 = zdanie.split(" ");

        OptionalDouble srednia = Arrays.stream(zdanie1)
                .mapToInt(String::length)
                .average();

        System.out.println("srednia dlugosc wszystkich znakow wynosi: " + srednia + ".");
    }
}
