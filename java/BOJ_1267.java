import java.util.Scanner;
 
public class BOJ_1267 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt(), n1 = 0, n2 = 0;
        for(int i = 0; i < n; i++) {
            int num = input.nextInt();
            n1 += (num / 30 + 1) * 10;
            n2 += (num / 60 + 1) * 15;
        }
        if(n1 > n2) System.out.println("M " + n2);
        else if(n1 < n2) System.out.println("Y " + n1);
        else System.out.println("Y M " + n1);
    }
}