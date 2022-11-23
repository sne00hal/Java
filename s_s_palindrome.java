import java.util.Scanner;

public class s_s_palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str= sc.nextLine();
        String org_str=str;

        String rev=" ";
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(org_str.equals(rev))
        {
            System.out.println("Palindrome String:"+org_str);
        }
        else
        {
            System.out.println("Not Palindrome String:"+org_str);
        }
    }
}

