
 
public class Timer {
 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
 
        // Ask user for input

        System.out.print("Enter Minutes: ");

        int minutes = scanner.nextInt();
 
        System.out.print("Enter Seconds: ");

        int seconds = scanner.nextInt();
 
        // Create 2D array: rows = minutes, columns = seconds (0–59)

        int[][] timer = new int[minutes + 1][60];
 
        try {

            // Loop over minutes (from input down to 0)

            for (int m = minutes; m >= 0; m--) {

                // If it's the first minute, start from user input seconds; otherwise start at 59

                int startSecond = (m == minutes) ? seconds : 59;
 
                // Loop over seconds (from start down to 0)

                for (int s = startSecond; s >= 0; s--) {

                    timer[m][s] = 1; // mark this minute:second as visited

                    System.out.printf("Time left: %02d:%02d\n", m, s);

                    Thread.sleep(1000); // wait for 1 second

                }

            }

            System.out.println("Time's up!");

        } catch (InterruptedException e) {

            System.out.println("Timer interrupted!");

        }
 
        scanner.close();

    }

}

 
        
 
