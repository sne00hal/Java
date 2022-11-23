import java.util.Scanner;

public class fact {
    public static void main(String[] args) 
    {
        int i,c,fact=1;
        System.out.println("Enter values");
        Scanner s = new Scanner(System.in);

        i = s.nextInt();

        if(i<0)
        System.out.println("no non-negative");
        else
        {
            for(c=1;c>=i;c++)
            fact = fact*c;
            System.out.println(fact);       
        }
        
    }
}
