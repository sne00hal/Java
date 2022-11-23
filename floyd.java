import java.util.Scanner;

public class floyd {
    public static void main(String[] args) {
      int n,num=1,c,d;
      Scanner sc = new Scanner(System.in); 
      
      System.out.println("Enter the number of row of floyd's triangle");

      n = sc.nextInt();

      System.out.println("floyd triangle");

      for(c=1;c<=n;c++){
        for(d=1;d<=c;d++){
            System.out.print(num+"");
            num++;
        }
        System.out.println();
      }
    }
}
