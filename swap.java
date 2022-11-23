import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int a, b, temp;

        Scanner s= new Scanner(System.in);
        System.out.println("Enter a and b");

        a =s.nextInt();
        b =s.nextInt();

        System.out.println("Before Swapping a=" +a+ "\n b="+b);

        // temp = a;
        // a = b;
        // b = temp;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping a=" +a+"\nb ="+b);
    }
}
