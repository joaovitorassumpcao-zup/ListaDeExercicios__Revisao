// 1. Faça um algoritmo que leia dois valores inteiros A e B se os
// valores forem iguais deverá se somar os dois, caso contrário multiplique A por B.
// Ao final de qualquer um dos cálculos deve-se atribuir o resultado para uma variável C
// e mostrar seu conteúdo na tela.

import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número A: ");
        int a = scanner.nextInt();

        System.out.print("Número B: ");
        int b = scanner.nextInt();

        int c;
        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }

        System.out.println(c);
    }
}
