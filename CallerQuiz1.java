import java.util.Scanner;

public class CallerQuiz1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = input.nextInt();

        System.out.print("Enter end number: ");
        int end = input.nextInt();

        WorkerQuiz1 worker = new WorkerQuiz1();
        worker.evenOddIdentify(start, end);

        input.close();
    }
}
