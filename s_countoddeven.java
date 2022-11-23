public class s_countoddeven {
    public static void main(String [] args){
        int no = 12345;
        
        int even_count = 0;
        int odd_count = 0;

        while(no>0)
        {
            int rem=no%10;

            if(rem%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
            no=no/10;
        }
        System.out.println("Number of Even no is"+even_count);
        System.out.println("Number of Odd no is"+odd_count);
    }
}
