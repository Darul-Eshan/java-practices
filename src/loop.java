import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        int m, n;
        int sum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number m: ");
            m = sc.nextInt();
            System.out.println("Enter Number n: ");
            n = sc.nextInt();

            for (int i = m; i <= n; i++) {
                if (i % 2 == 0) {
                    sum = sum + i;

                }
            }
        System.out.println(sum);
    }
}