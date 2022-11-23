public class s_arr_maxmin {
    public static void main(String[] args){
        int ar[] = {30,50,40,20,80};
        int max = ar[0];
        for(int i=1;i<ar.length;i++){
            if(ar[i]>max)
            {
                max=ar[i];
            }
        }
        System.out.println("Maximum element in the array is:"+max);

        int a[] = {30,50,40,20,80};
        int min = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("Maximum element in the array is:"+min);
           

    }
}
