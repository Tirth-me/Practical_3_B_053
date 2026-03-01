public class Full_Pyramid {
    public static void main(String[] args) {

        // -------- Star Inverted Pyramid --------
        for (int i = 5; i >= 1; i--) {

            // Spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println(); // Space between pyramids

        // -------- Alphabet Pyramid --------
        for (int i = 1; i <= 5; i++) {

            // Spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // Letters
            char ch = 'A';
            for (int k = 1; k <= i; k++) {
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }
    }
}