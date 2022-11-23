import java.util.Scanner;

public class while4 {
    public static void main(String[] args) {
       int n;

    //    System.out.println("Enter number");
       Scanner sc = new Scanner(System.in);
       
       while(true){
        System.out.println(" Enter Interger");
        n = sc.nextInt();
     
        if(n==0){
            break;
        }
      

       System.out.println("u entered "+n);

    }
}
}
