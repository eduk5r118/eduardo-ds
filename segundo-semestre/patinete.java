import java.util.Arrays;
import java.util.Scanner;

public class Patinete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] notasAntonio = new int[4];
        int[] notasCharles = new int[4];

        // Lê as 4 notas de Antonio
        for (int i = 0; i < 4; i++) {
            notasAntonio[i] = scanner.nextInt();
        }

        // Lê as 4 notas de Charles
        for (int i = 0; i < 4; i++) {
            notasCharles[i] = scanner.nextInt();
        }

        // Junta os dois arrays
        int[] todasNotas = new int[8];
        for (int i = 0; i < 4; i++) {
            todasNotas[i] = notasAntonio[i];
            todasNotas[i + 4] = notasCharles[i];
        }

        // Ordena o array de notas
        Arrays.sort(todasNotas);

        // Calcula a média simples
        int soma = 0;
        for (int nota : todasNotas) {
            soma += nota;
        }
        int media = soma / todasNotas.length; // arredondamento para baixo

        // Exibe o array de notas ordenado
        for (int nota : todasNotas) {
            System.out.print(nota + " ");
        }

        // Exibe a média
        System.out.println("\n" + media);

        scanner.close();
    }
}
