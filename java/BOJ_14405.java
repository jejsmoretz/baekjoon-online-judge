import java.util.Scanner;
 
public class BOJ_14405 {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        
        String st = input.nextLine();
        
        st = st.replace( "pi", " " );
        st = st.replace( "ka", " " );
        st = st.replace( "chu", " " );
        st = st.trim();
 
        String result = st.length() == 0 ? "YES" : "NO";
        System.out.println( result );
    }
 
}
