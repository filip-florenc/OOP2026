import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class OOP {
    public static void main(String[] args) {
        String[] filaryArray = {"Abstrakcja", "Enkapsulacja", "Dziedziczenie", "Polimorfizm"};

        Arrays.sort(filaryArray);
        System.out.println("---------------------");
        System.out.println("Wyświetlenie filarów OOP w kolejności alfabetycznej:");
        for (String filar : filaryArray) {
            System.out.println(filar);
        }
        System.out.println("---------------------");
        System.out.println("Wyświetlenie filarów OOP w kolejności losowej:");
        List<String> filaryLista = Arrays.asList(filaryArray);
        Collections.shuffle(filaryLista);
        for (String f : filaryLista)
        {
            System.out.println(f);
        }
        System.out.println("---------------------");
    }
}