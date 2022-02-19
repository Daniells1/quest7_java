/*
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão na área direita da matriz
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.
 */
package com.company;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                double[][] MATRIZ = new double[12][12];
                double sum = 0;
                int count = 0;
                char operation = sc.next().toUpperCase().charAt(0);

                for (int K = 0; K < MATRIZ.length; K++) {
                        for (int L = 0; L < MATRIZ.length; L++) {
                                MATRIZ[K][L] = sc.nextDouble();
                                if ((K < L) && ((K + L) >= (MATRIZ.length))) {
                                        sum += MATRIZ[K][L];
                                        count++;
                                }
                        }
                }

                if (operation == 'M') sum /= count;
                System.out.printf("%.1f%n", sum);
        }
}
