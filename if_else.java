import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class if_else {
    public static void main(String[] args) {
        int Passingmark, Obtainedmark;
        char grade;
        Passingmark = 40;

        // System.out.println("Enter Mark");
        Scanner s = new Scanner(System.in);
        System.out.println("Marks Scored by you");
        Obtainedmark =s.nextInt();

        if(Obtainedmark>Passingmark){
            if(Obtainedmark >90)
            grade = 'A';
            else if(Obtainedmark >75)
            grade = 'B';
            else if(Obtainedmark >60)
            grade = 'C';
            else
            grade = 'D';

            System.out.println("You Passed exam grade is "+grade);
        }
        else{
            grade = 'F';
            System.out.println("You are fail " +grade);
        }

    }
}
