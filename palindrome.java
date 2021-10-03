import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int remain;
        if (1 <= t && t <= 20) {
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                if (1 <= n && n <= 20000) {
                    int temp = n;
                    int first = 0;
                    while(n>0){
                        remain = n % 10;
                        first = (first * 10) + remain;
                        n /= 10;  
                    }
                    
                    if (temp == first) {
                        System.out.println("wins");
                    } else {
                        System.out.println("loses");
                    }
                    
                }
            }
        }
    }
}
