import java.util.HashSet;

public class s_arr_duplicate {
    public static void main(String[] args){
        int a[] = {2,3,4,45,5};
    //Approch 1:-
    /* 
    boolean flag = false;
    for(int i=0;i<a.length;i++)
    {
       for(int j=i+1;j<a.length;j++)
       {
            if(a[i]==a[j])
            {
                System.out.println("Found duplication element:"+a[i]);
                flag = true;
            }
       }
    }
    if(flag==false)
    {
        System.out.println("Duplicate value not found");
    }*/

    //Approch 2:-
    HashSet <Integer>langs = new HashSet();
    
    System.out.println(langs.add(2));
    System.out.println(langs.add(3));
    System.out.println(langs.add(3));    
    }
}
