import java.util.*;
 
public class BOJ_13241 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        long GCD;    // 최대공약수
        long LCM;    // 최소공배수
        
        long A = input.nextInt();    // A
        long B = input.nextInt();    // B
        
        long a = A;
        long b = B;
        
        while( true ) {
            if( A > B ) {
                if ( b == 0 ) {
                    LCM = A * B / a;
                    break;
                } else {
                    GCD = a % b;
                    a = b;
                    b = GCD;
                }
            } else {
                if ( a == 0 ) {
                    LCM = B * A / b;
                    break;
                } else {
                    GCD = b % a;
                    b = a;
                    a = GCD;
                }
            }
        }
        
        System.out.println(LCM);
        
    }
 
}
