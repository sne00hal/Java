import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int n, reverse=0;

        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();

        while(n!=0)
        {
            reverse = reverse *10 + n%10;
            n = n/10;
        }
        System.out.println("Reverse no"+ reverse);
    }
}
