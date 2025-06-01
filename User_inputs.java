import java.util.Scanner;

public class User_inputs {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        System.out.println("User entered number is: " + number);

        System.out.println("Enter a name : ");
        String str = scanner.next();
        System.out.println("User entered name is: " + str);
    }
}
