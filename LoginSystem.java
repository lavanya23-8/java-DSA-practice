import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        String username = "admin";
        String password = "1234";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String user = sc.nextLine();
        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        if (user.equals(username) && pass.equals(password)) {
            System.out.println(" Login Successful!");
        } else {
            System.out.println(" Invalid Credentials!");
        }

        sc.close();
    }
}
