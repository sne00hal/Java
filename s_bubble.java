import java.util.Arrays;
public class s_bubble {
    public static void main(String[] args){
        int a[] = {2,5,6,3,5,9};
        System.out.println("Array Before sorting:"+Arrays.toString(a));

        int n = a.length;

        for(int i=0; i<n-1;i++ )
        {
            for(int j=0;j<n-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Array After sorting:"+Arrays.toString(a));
    }
}
