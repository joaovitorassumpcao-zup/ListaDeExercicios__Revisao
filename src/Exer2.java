import java.util.Scanner;

// 2. Faça um algoritmo que leia uma variável e some 5 caso seja par ou
// some 8 caso seja ímpar, imprimir o resultado desta operação.
public class Exer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Seu número: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            num += 5;
        } else {
            num += 8;
        }

        System.out.println("Resultado: " + num);
    }
}
