
/* programa para imprimir apenas os números ímpares
dentro de um intervalo informado pelo usuário
 */

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio, fim, contador;

        System.out.print("Início do intervalo --> ");
        inicio = sc.nextInt();
        System.out.print("Fim do intervalo --> ");
        fim = sc.nextInt();

        if(inicio % 2 == 0) {
            contador = inicio + 1;
        }
        else {
            contador = inicio;
        }

        while(contador <= fim) {
            System.out.print(contador + " ");
            contador = contador + 2;
        }

    }
}
