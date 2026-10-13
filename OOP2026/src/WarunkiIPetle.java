public class WarunkiIPetle {
    public static void main(String[] args) {
        int n = 13;
        int i = 1;
        System.out.println("Wszystkie po kolei");
        for(int ii=1; ii<=n; ii++)
        {
            System.out.println(ii);
        }
        System.out.println("");
        System.out.println("Parzyste");
        while (i<=n)
        {
            if(i%2==0)
            {
                System.out.println(i);
                i+=2;
            }
            else
            {
                i++;
            }
        }
    }
}
