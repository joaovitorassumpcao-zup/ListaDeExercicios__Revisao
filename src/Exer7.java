import java.util.Scanner;

public class Exer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Número: ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(nome);
        }
    }
}
