public class s_removejunk_specialstring {
    public static void main(String[] args){
        String s ="@#$%%**()(&^%$# latin string 01234567890";
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
    }
}
