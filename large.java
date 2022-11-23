import java.util.Scanner;

public class large {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x,y,z;
        System.out.println("Enter three Values");

        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        if( x>y && y>z)
        System.out.println("First number is Larger");

        else if(y>x && y>z)
        System.out.println("Second number is Larger");

        else if(z>x && z>y)
        System.out.println("Third Number is Larger");

        else
        System.out.println("Number is Different");
    }
}
