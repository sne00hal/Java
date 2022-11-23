import java.util.Arrays;
public class s_arrayequal{
    public static void main(String[] args){
        int a1[] = {3,4,5,4,7};
        int a2[] = {3,4,5,4,7};
        //Approch 1
        /* 
        boolean status = true;
        if(a1.length == a2.length)
        {
            for(int i=0;i<a1.length;i++)
            {
                if(a1[i]!= a2[i])
                {
                    status=false;
                }
            }
        }
        else{
            status=false;
        }
        if(status==true)
        {
            System.out.println("Array are equal");
        }
        else{
            System.out.println("Array are not equal");
        }*/

        //Approch 2
        boolean status = Arrays.equals(a1,a2);

        if(status==true)
        {
            System.out.println("Arrays are equal");
        }
        else
        {
            System.out.println("Arrays are not equal");
        }
    }
}