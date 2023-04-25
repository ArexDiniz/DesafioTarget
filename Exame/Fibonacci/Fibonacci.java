package Exame.Fibonacci;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        boolean pertence = false;
        int primeiro = 0, segundo = 1, terceiro;

        if (numero == 0 || numero == 1) {
            pertence = true;
        } else {
            for (int i = 1; i <= numero; i++) {
                terceiro = primeiro + segundo;
                primeiro = segundo;
                segundo = terceiro;

                if (terceiro == numero) {
                    pertence = true;
                    break;
                }
            }
        }

        if (pertence) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
}