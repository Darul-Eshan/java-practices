import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        int m,n,i;
        int sum=0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number m: ");
            m = sc.nextInt();
            System.out.println("Enter second number n: ");
            n = sc.nextInt();
            if (m < n) {
                break;
            } else {
                System.out.println("try againg");
            }
            for (i = m; i <= n; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        }
        System.out.println("Sum of odd numbers from " + m + " to " + n + " is: " + sum);
    }
}
