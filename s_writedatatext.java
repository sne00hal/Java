import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

public class s_writedatatext {
    public static void main(String[] args) throws Exception{

        FileWriter fw = new FileWriter("C:\\Users\\sneha\\Desktop\\Java2\\test1.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Java is Most Popular used Langugage\n");
        bw.write("Java is used for coding\n");
        bw.write("Java is also used for Web Devlopment\n");

        System.out.println("Finish!!!!");

        bw.close();
    }
}
