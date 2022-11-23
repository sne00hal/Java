import java.util.Arrays;
import java.util.Collections;

public class s_arraybuilt {
    public static void main(String[] args){
    
    // Approch 1
    // int a[] = {30,50,20,10,70};

    // System.out.println("Array element before sorting:"+ Arrays.toString(a));
    // Arrays.parallelSort(a);
    // System.out.println("Array element After sorting:"+ Arrays.toString(a));

    // Approch 2
    // int a[] = {30,50,20,10,70};
    // System.out.println("Array element before sorting:"+ Arrays.toString(a));
    // Arrays.sort(a);
    // System.out.println("Array element After sorting:"+ Arrays.toString(a));

    // Approch 2 reverse decending
    Integer a[] = {30,50,20,10,70};
    System.out.println("Array element before sorting:"+ Arrays.toString(a));
    Arrays.sort(a,Collections.reverseOrder());
    System.out.println("Array element After sorting:"+ Arrays.toString(a));




    }
}
