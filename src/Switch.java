import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        System.out.println(" select option:1,2,3,4,5 ");
        option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println(" Selected language is Bengali");
                break;
                case 2:
                    System.out.println(" Selected language is English");
                    break;
                    case 3:
                        System.out.println(" Selected language is Spanish");
                        break;
                        case 4:
                            System.out.println(" Selected language is French");
                            break;
                            default:
                                System.out.println(" Selected language is Unknown");
        }
    }
}
