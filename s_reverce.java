import java.util.Scanner;

public class s_reverce {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int rev=0;

        // while(n!=0){
        //     rev = rev*10 + n%10;
        //     n=n/10;
        // }
        int num = sc.nextInt();
        // StringBuffer rev;
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        System.out.println("Reverse number is:" +rev);
    }
}
