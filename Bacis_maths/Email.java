import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First Name: ");
        String first = sc.next();
        System.out.print("Last Name: ");
        String last = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Emp ID: ");
        int empId = sc.nextInt();

        String email = first.substring(0, 3) +
                       last.substring(last.length() - 3,last.length()) +
                       age +
                       String.valueOf(empId).substring(String.valueOf(empId).length() - 2) +
                       "@xxx.com";

        System.out.println("Generated Email: " + email);
    }
}
