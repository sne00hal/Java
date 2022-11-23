import java.util.Scanner;

public class s_palidrome {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number");
      int num = sc.nextInt();
      
      int rev=0;
      int org_no=num;
      while(num!=0){
        rev=rev*10 + num%10;
        num=num/10;
      }
      if(org_no==rev){
        System.out.println("Palindrome number"+org_no);
      }
      else{
        System.out.println("Not palindrome number"+org_no);
      }
    }
}

