import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 0, in;

        for (int i = 0; i < 20; i++) {
            System.out.print("Seu número: ");
            in = scanner.nextInt();

            if (in > 0 && in < 100) cont++;
        }

        System.out.println("Total de números entre 0 e 100 é " + cont);
    }
}
