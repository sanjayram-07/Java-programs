import java.util.Arrays;
import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] digits = new int[4];
        System.out.print("Enter 4 digits: ");
        for (int i = 0; i < 4; i++) {
            digits[i] = sc.nextInt();
        }

        Arrays.sort(digits);
        int smallest = digits[0]*1000 + digits[1]*100 + digits[2]*10 + digits[3];
        int largest = digits[3]*1000 + digits[2]*100 + digits[1]*10 + digits[0];

        System.out.println("Largest number is " + largest);
        System.out.println("Smallest number is " + smallest);
    }
}

