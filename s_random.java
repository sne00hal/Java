import java.util.Random;

public class s_random {

    public static void main(String[] args){

        Random rand = new Random();

        int rand_int = rand.nextInt(10);
        System.out.println(rand_int);

        // double rand_dbl = rand.nextDouble(4.0);
        // System.out.println(rand_dbl);

    }
}
