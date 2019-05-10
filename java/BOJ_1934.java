import java.util.*;
 
public class BOJ_1934 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int T = input.nextInt();
        
        int GCD;    // 최대공약수
        
        int[][] array = new int[T][3];
        
        for( int i = 0; i < T; i++) {
            array[i][0] = input.nextInt();    // A
            array[i][1] = input.nextInt();    // B
            
            int a = array[i][0];
            int b = array[i][1];
            
            while( true ) {
                if( array[i][0] > array[i][1] ) {
                    if ( b == 0 ) {
                        array[i][2] = array[i][0] * array[i][1] / a;
                        break;
                    } else {
                        GCD = a % b;
                        a = b;
                        b = GCD;
                    }
                } else {
                    if ( a == 0 ) {
                        array[i][2] = array[i][1] * array[i][0] / b;
                        break;
                    } else {
                        GCD = b % a;
                        b = a;
                        a = GCD;
                    }
                }
            }
        }
        
        for( int i = 0; i < T; i++) {
            System.out.println(array[i][2]);
        }
        
    }
 
}
