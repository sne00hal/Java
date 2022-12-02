import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class s_readatatext {
    public static void main(String[] args) throws Exception{
        //filereader bufferreader

        FileReader fr = new FileReader("C:\\Users\\sneha\\Desktop\\Java2\\text.txt");
        BufferedReader br = new BufferedReader(fr);

        String str;

        while((str=br.readLine())!=null)
        {
            System.out.println(str);
        }
        br.close();
    }
}
