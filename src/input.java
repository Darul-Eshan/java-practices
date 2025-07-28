import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id;
        String  title, price, description, category;
        System.out.print("Enter ID: ");
        id = input.nextInt();
        System.out.print("Enter Title: ");
        title = input.next();
        System.out.print("Enter Price: ");
        price = input.next();
        System.out.print("Enter Description: ");
        description=input.next();
        System.out.print("Enter Category: ");
        category= input.next();
        System.out.print("Your ID: "+id+"\n");
        System.out.print("Your Title: "+title+"\n");
        System.out.print("Your Price: "+price+"\n");
        System.out.print("Your Description: "+description+"\n");
    }
}
