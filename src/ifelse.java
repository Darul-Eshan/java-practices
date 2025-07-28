import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("Enter Your Age");
        age = input.nextInt();
        if(age >= 18){
            System.out.println("You are Voter");
        }
        else{
            System.out.println("You are not Voter");
        }
    }
}
