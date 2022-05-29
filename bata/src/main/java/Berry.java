import java.util.Scanner;

public class Berry
{
    public String isEven(int w)
    {
        if (w % 2 == 0 && w != 0 && w < 15)
        {
           return "yes";
        }
        else {
            return "no";
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter weight");
        int w = sc.nextInt();
    }
}