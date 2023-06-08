import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0, in;

        while (true) {
            System.out.print("Seu número: ");
            in = scanner.nextInt();

            if (in < 0) break;

            sum += in;
        }

        System.out.println("Soma é " + sum);
    }
}
