import java.util.Scanner;

public class arre2 {
    public static void main(String[] args) {
        int[][] matrix= new int [3][3];
        int[] row = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number");
        for (int i = 0; i < 3; i++) {
            row[i]=Integer.MIN_VALUE;
            for (int j = 0; j < 3; j++) {
           matrix[i][j]=sc.nextInt();
            if(matrix[i][j]>row[i]){
                row[i]=matrix[i][j];
            }
            }
        }
        System.out.println("Maximum value from each row:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Row " + i + " max: " + row[i]);
        }
        sc.close();
    }
}
