public class s_arr_missing {
    public static void main(String[] args){
        int sum1=0;
        int a[] = {1,2,3,5};
        for(int i=0;i<a.length;i++)
        {
            sum1=sum1+a[i];
        }
        System.out.println("Sum of element in array:"+sum1);

        int sum2=0;
        for(int i=1;i<=5;i++){
            sum2=sum2+i;
        }
        System.out.println("Sum of range of element:"+sum2);

        System.out.println("Missing number is:"+(sum2-sum1));
    }
}
