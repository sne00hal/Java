public class s_count {
    public static void main(String[] args){
        int no=28343;
        int count=0;
        while(no>0){
            no=no/10;
            count++;
        }
        System.out.println("Total number is"+count);
    }
    
}
