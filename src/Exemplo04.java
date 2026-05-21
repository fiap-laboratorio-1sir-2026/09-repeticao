
/* programa em java para ler um número na base ternária. O seu programa
deverá:
1. validar se o número realmente está na base ternária
2. Converter o valor para a base decimal
 */

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ternario, decimal = 0, digito, expoente = 0, aux;
        boolean status = true;

        System.out.print("Informe um valor positivo na base ternária --> ");
        ternario = sc.nextInt();
        aux = ternario;

        do {
            digito = ternario % 10;
            if(digito != 0 && digito != 1 && digito != 2) {
                status = false;
                break;
            }
            ternario = ternario / 10;
        } while(ternario > 0);

        if(status) {
            ternario = aux;
            do {
                digito = ternario % 10;
                decimal = (int)(decimal + digito * Math.pow(3, expoente));
                ternario = ternario / 10;
                expoente++;
            } while(ternario > 0);
            System.out.println(aux + " --> " + decimal);
        }
        else {
            System.out.println("inválido");
        }

    }
}
