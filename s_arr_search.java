public class s_arr_search {
    public static void main(String[] args){
        int a[] = {20,30,10,35,80};
        int ser_ele = 10;
        boolean flag = false;

        for(int i=0;i<a.length;i++)
        {
            if(ser_ele==a[i])
            {
                System.out.println("Element found at:"+i);
                flag = true;
            }
        }
        if(flag==false)
        {
            System.out.println("Element not found");
        }
    }
}
