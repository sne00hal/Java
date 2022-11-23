import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("input interger");
            n = sc.nextInt();

            if(n!=0){
                System.out.println("you entered"+n);
                continue;
            }
            else{
                break;
            }
        }
    }
}
