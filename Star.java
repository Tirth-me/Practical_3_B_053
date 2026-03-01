public class Star {
    public static void main(String[] args) {

        // -------- Pattern 1 : Right Half Star Pyramid --------
        System.out.println("Right Half Star Pyramid:\n");

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

       

        int num = 1;

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {

                System.out.print(num + " ");
                num++;

                // Reset after 9 to start again from 1
                if (num > 9) {
                    num = 1;
                }
            }
            System.out.println();
        }
    }
}