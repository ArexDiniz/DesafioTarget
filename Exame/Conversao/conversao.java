
package Exame.Conversao;

import java.util.*;

public class conversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;

        System.out.println("Digite a palavra que quer converter");
        palavra = sc.nextLine();
        int j = palavra.length() - 1;
        char inverso[] = new char[palavra.length()];
        for (int i = 0; i < palavra.length(); i++) {
            inverso[i] = palavra.charAt(j);
            j--;
        }
        String palavraReversa = "";
        for (int i = 0; i < palavra.length(); i++) {
            palavraReversa = palavraReversa + inverso[i];

        }
        System.out.println(palavraReversa);
    }
}
