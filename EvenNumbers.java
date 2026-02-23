import java.util.ArrayList;
import java.util.Collections;

public class EvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> evens = new ArrayList<>();
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evens.add(i);
                sum += i;
            }
        }

        System.out.println("Even numbers 1-100: " + evens);
        System.out.println("Minimum even number: " + Collections.min(evens));
        System.out.println("Maximum even number: " + Collections.max(evens));
        System.out.println("Total (sum): " + sum);
    }
}