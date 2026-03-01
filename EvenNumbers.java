import java.util.ArrayList;
import java.util.Collections;

public class EvenNumbers {
    public static void main(String[] args) {

        // ---------------- EVEN NUMBERS (1-100) ----------------
        ArrayList<Integer> evens = new ArrayList<>();
        int evenSum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evens.add(i);
                evenSum += i;
            }
        }

        System.out.println("Even numbers 1-100: " + evens);
        System.out.println("Minimum even number: " + Collections.min(evens));
        System.out.println("Maximum even number: " + Collections.max(evens));
        System.out.println("Total (sum) of even numbers: " + evenSum);

        // ---------------- ODD NUMBERS (1-50) ----------------
        ArrayList<Integer> odds = new ArrayList<>();
        int oddSum = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                odds.add(i);
                oddSum += i;
            }
        }

        System.out.println("\nOdd numbers 1-50: " + odds);

        Collections.sort(odds);

        // Three minimum odd numbers
        System.out.println("Three minimum odd numbers: "
                + odds.get(0) + ", "
                + odds.get(1) + ", "
                + odds.get(2));

        // Three maximum odd numbers
        int size = odds.size();
        System.out.println("Three maximum odd numbers: "
                + odds.get(size - 1) + ", "
                + odds.get(size - 2) + ", "
                + odds.get(size - 3));

        // Average of odd numbers
        double oddAverage = (double) oddSum / odds.size();
        System.out.println("Average of odd numbers (1-50): " + oddAverage);
    }
}