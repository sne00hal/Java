import java.util.Scanner;

public class temp_cel {
    public static void main(String[] args) {
        float temp;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter temperature in Fahrenheit");
    temp = sc.nextInt();

    temp = ((temp-32)*5)/9;

    System.out.println("temperature in celsius" + temp);

    }
    
}
