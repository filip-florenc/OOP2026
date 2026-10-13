import java.util.Scanner;
public class KalkulatorProsty {
    public static void main(String[] args) {

        double a = 11;
        double b = 4;

        double suma = a+b;
        double roznica = a-b;
        double iloczyn = a*b;
        double iloraz = a/b;

        System.out.println("Suma liczb "+a+" i "+b+" wynosi: "+suma);
        System.out.println("Różnica liczb "+a+" i "+b+" wynosi: "+roznica);
        System.out.println("Iloczyn liczb "+a+" i "+b+" wynosi: "+iloczyn);
        System.out.println("Iloraz liczb "+a+" i "+b+" wynosi: "+iloraz);
    }
}
