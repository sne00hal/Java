import java.util.Scanner;

public class sswap {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values");
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Before Swapping: "+a+" "+b);
        // temp=a;
        // a=b;
        // b=temp;

        a = a + b;
        b = a - b;
        a = a - b;

      
        System.out.println("After Swapping: "+a+" "+b);
    }
}
