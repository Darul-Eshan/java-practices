import java.util.Scanner;

public class  arre {
    public static void main(String[] args) {
        int[] number = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");


        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();

           sum = sum+number[i];


        }
        System.out.println(sum);
        System.out.print("AVg "+sum/number.length);
    }
}
