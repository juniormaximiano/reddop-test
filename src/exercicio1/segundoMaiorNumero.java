package exercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class segundoMaiorNumero {

    public static void main(String[] args) {

        Scanner inputArray = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros: ");

        int tamanho = inputArray.nextInt();

        int[] arrayNumeros = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {

            System.out.println("Digite o valor o próximo valor ");
            arrayNumeros[i] = inputArray.nextInt();

        }

        System.out.println("Os valores são: " + Arrays.toString(arrayNumeros));

        Integer maior = null;

        Integer segundoMaior = null;

        for (int i = 0; i <  tamanho; i++) {

            int numeroAtual = arrayNumeros[i];


            if ((maior == null) || numeroAtual > maior) {
                segundoMaior = maior;
                maior = numeroAtual;

            } else if (numeroAtual != maior &&(segundoMaior == null || numeroAtual > segundoMaior) ) {
                segundoMaior = numeroAtual;
            }

        }

        if (segundoMaior == null) {
            System.out.println("Não existe segundo maior distinto");
        } else {
            System.out.println("Segundo maior: " + segundoMaior);
        }


    }
}
