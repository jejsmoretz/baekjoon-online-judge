import java.util.*;
 
class BOJ_1152 {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        
        String s = input.nextLine();
        int count = 1;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                count++;
            }
        }
        
        if(s.charAt(0) == ' ') {
            count--;
        }
        if(s.charAt(s.length() - 1) == ' ') {
            count--;
        }
        
        System.out.println(count);
 
    }
    
}
