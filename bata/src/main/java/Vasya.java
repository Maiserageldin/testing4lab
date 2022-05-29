import java.util.Scanner;

public class Vasya {
    private static int xsum = 0;
    private static int ysum = 0;
    private static int zsum = 0;
    public String isequilibrium(int xsum , int ysum, int zsum)
    {
        if ( xsum == 0 && ysum == 0 && zsum == 0)
            return "it is in equilibrium";
        else
            return "it is not in equilibrium";
    }

    public static void main(String[] args) {
        System.out.println("Enter no. of forces");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] matrix = new int[number*3];

        for (int i = 0; i < number*3; i++)
            matrix[i] = sc.nextInt();
            for(int i=0; i < number*3; i += 3)
            {
                xsum= xsum + matrix[i];
                ysum= ysum + matrix[i+1];
                zsum = zsum  + matrix[i+2];
            }
}
}
