public class TablicaOcen {
    public static void main(String[] args) {
        double[] oceny = {5, 4.5, 3, 4, 4};
        double max = oceny[0];
        double min = oceny[0];;
        double avg = 0;
        System.out.println("Oceny: ");
        for (int i = 0; i < oceny.length; i++) {
            System.out.print(oceny[i]+"  ");
            avg=avg+oceny[i];
            if(oceny[i]>max)
            {
                max = oceny[i];
            }
            if(oceny[i]<min)
            {
                min = oceny[i];
            }

        }
        System.out.println(" ");
        System.out.println("Najniższa ocena wynosi: "+min);
        System.out.println("Najwyższa ocena wynosi: "+max);
        avg=avg/ oceny.length;
        System.out.println("Średnia wynosi: "+avg);
    }
}
