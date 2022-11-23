import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("input an integer");
            n = sc.nextInt();

            if(n==0){
                break;
            }
            System.out.println("You entered"+n);
        }
    }
}
