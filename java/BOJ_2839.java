import java.util.Scanner;

public class BOJ_2839 {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        int result = -1;
        
        for(int i = N / 5;i >= 0; i--) {
            if((i * 5) + (((N - (i * 5)) / 3) * 3) == N) {
                result = i + ((N - (i * 5)) / 3);
                break;
            }
        }
        System.out.println(result);
		
	}
	
}
