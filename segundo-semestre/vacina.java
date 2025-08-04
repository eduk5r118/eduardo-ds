import java.util.Scanner;

public class BuscaVacina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o tamanho do arranjo
        int N = Integer.parseInt(scanner.nextLine());
        int[] genes = new int[N];

        // Lê os N valores genéticos
        for (int i = 0; i < N; i++) {
            genes[i] = Integer.parseInt(scanner.nextLine());
        }

        // Lê o valor genético que será analisado
        int valorAlvo = Integer.parseInt(scanner.nextLine());

        // Conta quantas vezes o valor aparece
        int contagem = 0;
        for (int i = 0; i < N; i++) {
            if (genes[i] == valorAlvo) {
                contagem++;
            }
        }

        // Imprime a resposta com base na contagem
        if (contagem > 1) {
            System.out.println("Achei o danado");
        } else if (contagem == 1) {
            System.out.println("Ainda não é o suficiente");
        } else {
            System.out.println("Sumiuu!");
        }

        scanner.close();
    }
}
