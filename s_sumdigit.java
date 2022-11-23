public class s_sumdigit {
    public static void main(String[] args){
        int no = 1234;
        int sum=0;
    
        for(int i=1;i<=4;i++){  //while(no>0)
            sum=sum+no%10;
            no=no/10;
        }
        System.out.println("Sum of digits"+sum);
    }
}
