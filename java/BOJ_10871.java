import java.util.Scanner;

public class BOJ_10871 {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        int X = input.nextInt();
        
        int[] A = new int[N];
        
        for(int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }
        
        for(int i = 0; i < A.length; i++) {
            if(A[i] < X)
                System.out.print(A[i]+ " ");
        }
		
	}
	
}