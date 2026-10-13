public class TypyDanychDemo {
    public static void main(String[] args)
    {
        byte bajt = 13;
        short rok = 2026;
        int saldo = 123123123;
        long duze = 12312312313313L;
        float f = 3.14f;
        double przecinek = 2.115123123123;
        boolean prawda = true;
        char litera = 'C';

        System.out.println("Całkowitoliczbowe");
        System.out.println(bajt + " byte - -128 do 127");
        System.out.println(rok + " short - -32,768 do 32,767");
        System.out.println(saldo + " int - ok. -2 mld do 2 mld (domyślne)");
        System.out.println(duze + " long - bardzo duże liczby (wymaga przyrostka L)");
        System.out.println("Zmiennoprzecinkowe");
        System.out.println(f + " float - precyzja do 7 cyfr (wymaga przyrostka f)");
        System.out.println(przecinek + " double - precyzja do 15 cyfr (domyślne)");
        System.out.println("Logiczny");
        System.out.println(prawda + " boolean - true lub false");
        System.out.println("Znakowy");
        System.out.println(litera + " char - pojedynczy znak Unicode (np. 'A')");
    }
}
