import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first String");
        s1 = sc.nextLine();

        System.out.println("Enter second String");
        s2 = sc.nextLine();

        if(s1.compareTo(s2)>0)
        System.out.println("First String is greater than second");

        else if(s1.compareTo(s2)<0)
        System.out.println("First String is smaller than second");
        
        else
        System.out.println("Both String are equal");


    }
}
