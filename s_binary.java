public class s_binary {
    public static void main(String[] args){

        int a[] = {1,3,5,7,9};      

        int key = 3;
        int l = 0;
        int h=a.length-1;
        int m = (l+h)/2;

        while(l<=h)
        {
            
            if(a[m]<key)              
                h=m+1;
            

            else if(a[m]==key)
            {
                System.out.println("Element Found...");
                break; 

            }
            else
            {
                h=m-1;
            }
        
          m = (l+h)/2 ;
        }

        if( l > h)
            System.out.println("Element not Found...");
        
       
    }
}
