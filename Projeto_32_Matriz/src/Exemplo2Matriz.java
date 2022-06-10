import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class Exemplo2Matriz {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Declaração da matriz
        int [][] numeros = new int[2][2];
        int somaLinhas = 0, total = 0;

        // Armazenar os dados
        for (int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[i].length; j++){
            System.out.println("Digite um numero para a posicao [" + i + "][" + j + "]: ");
            numeros[i][j] = teclado.nextInt();
            }
        }

        // Percorrer os dados para calcular o somatório
        for (int i = 0; i < numeros.length; i++){
            somaLinhas = 0; //Zera o acumulador de linhas toda vez que inicia uma nova linha
            for (int j = 0; j < numeros[i].length; j++){
                somaLinhas += numeros[i][j]; //Acumula os somatórios dos elementos de cada linha
            }
            System.out.println("A soma da linha [" + i + "] e: " + somaLinhas);

            total += somaLinhas; //acumula o somatório total dos elementos da matriz
        }

        System.out.println("O somatorio dos elementos da matriz é: " + total);

        // Percorrer a matrix para imprimir os dados
        System.out.println("=================================================");
        System.out.println("|             Elementos da Matriz               |");
        System.out.println("=================================================");
        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println("");
        }
        teclado.close();
    }
}
