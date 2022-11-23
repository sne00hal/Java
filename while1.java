import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer");

        while((n=sc.nextInt())!=0){
            System.out.println("You entered "+ n);
            System.out.println("input an integer");
        }
        System.out.println("out of loop");

    }
}
