import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number(1-9): ");
        int num = input.nextInt();
        if (num==1){
            System.out.println("The number is ONE");
        }
            else if (num==2){
                System.out.println("The number is TWO");
        }
            else if (num==3){ System.out.println("The number is THREE"); }
            else if (num==4){ System.out.println("The number is FOUR"); }
            else if (num==5){ System.out.println("The number is FIVE"); }
            else if (num==6){ System.out.println("The number is SIX"); }
            else if (num==7){ System.out.println("The number is SEVEN"); }
            else if (num==8){ System.out.println("The number is EIGHT"); }
            else if (num==9){ System.out.println("The number is NINE"); }
            else{ System.out.println("The number is out of 9"); }
    }
}
