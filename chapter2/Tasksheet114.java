import java.util.Scanner;
public class Tasksheet114 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int check_number = 10;
        String message;

        System.out.println("Please enter a number: ");
        check_number = scan.nextInt();

        syntax:  message = (check_number%2==0) ? check_number + " is even number" : check_number + " is odd number";
        System.out.println(message);
    }
}