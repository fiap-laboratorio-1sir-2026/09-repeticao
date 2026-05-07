import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, contador = 0, resultado;
        int resposta = 1;

        while(resposta == 1) {
            System.out.print("Valor: ");
            valor = sc.nextInt();
            contador = 0;
            while (contador <= 10) {
                resultado = valor * contador;
                System.out.println(valor + " x " + contador + " = " + resultado);
                contador = contador + 1;
            }
            System.out.print("Digite 1 para nova tabuada ou 0 para finalizar");
            resposta = sc.nextInt();
        }
    }
}
