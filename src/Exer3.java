/*
    3. Escreva um algoritmo que leia o número de identificação, as 3 notas obtidas
    por um aluno nas 3 verificações e a média dos exercícios que fazem parte da
    avaliação, e calcule a média de aproveitamento,
    usando a fórmula: MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7
    A atribuição dos conceitos obedece a tabela abaixo. O algoritmo deve escrever
    o número do aluno, suas notas, a média dos exercícios, a média de aproveitamento,
    o conceito correspondente e a mensagem 'Aprovado' se o conceito for A, B ou C,
    e 'Reprovado' se o conceito for D ou E.
    Média de aproveitamento Conceito
    >= 90 A
    >= 75 e < 90 B
    >= 60 e < 75 C
    >= 40 e < 60 D
    < 40 E
*/

import java.util.Random;
import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    }
}

class Aluno {
    public int id;
    public float nota1;
    public float nota2;
    public float nota3;
    public float media;
    public float mediaAproveitamento;
    public boolean aprovado;

    public Aluno(int id, float nota1, float nota2, float nota3, float media) {
        if (nota1 > 10 || nota1 < 0) throw new IllegalArgumentException("Nota 1 inválida!");
        if (nota2 > 10 || nota2 < 0) throw new IllegalArgumentException("Nota 2 inválida!");
        if (nota3 > 10 || nota3 < 0) throw new IllegalArgumentException("Nota 3 inválida!");

        this.id = id;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;

        this.media = (nota1 + nota2 + nota3) / 3;
        this.mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + media) / 7;


    }

    // Imprime as variaveis da classe
    public void print() {
        System.out.printf("ID: %d %n" +
                "Nota1: %.1f %n" +
                "Nota2: %.1f %n" +
                "Nota3: %.1f %n" +
                "Media: %.1f %n" +
                "Media de Aproveitamento: %.1f %n",
                this.id,this.nota1,this.nota2,this.nota3,this.media,this.mediaAproveitamento
        );
    }
}


