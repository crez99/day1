package Welcome;

public class Welcome {

    /**
     * This program displays a greeting for the reader
     */
        public static void main(String[] args) {
            String greeting = "Welcome to Core Java!";
            System.out.println(greeting);
            for (int i = 0; i < greeting.length(); i++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }

