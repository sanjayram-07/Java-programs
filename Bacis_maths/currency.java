import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notes = {2000, 500, 100, 50, 20, 10, 5, 2};
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        System.out.println("Minimum currency notes:");
        for (int note : notes) {
            if (amount >= note) {
                int count = amount / note;
                amount %= note;
                System.out.println(note + " : " + count);
            }
        }

        if (amount != 0)
            System.out.println("Remaining amount: " + amount);
    }
}
