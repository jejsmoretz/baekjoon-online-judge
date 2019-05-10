import java.util.Scanner;

public class BOJ_1924 {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
        int dayTotal = 0;
        
        int x = input.nextInt();    // 월
        int y = input.nextInt();    // 일
 
        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        for(int i = 0; i < x; i++) {
            dayTotal += month[i];
            if(i+1 == x) {
                System.out.println(day[(dayTotal+y) % 7]);
            }
        }
		
	}
	
}
