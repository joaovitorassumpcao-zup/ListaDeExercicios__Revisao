import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Idade da Pessoa 1 -> ");
            soma += scanner.nextInt();
        }

        System.out.println("A média de idades é " + (soma / 20));
    }
}
