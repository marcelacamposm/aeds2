import java.util.Scanner;

public class RecursividadeClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n============================================");
            System.out.println("\nSelecione a opcao desejada:\n");
            System.out.println("1. Metodo recursivo 1");
            System.out.println("2. Metodo recursivo 2");
            System.out.println("3. Metodo recursivo 3");
            System.out.println("4. Encontrar a posicao de um numero em um vetor");
            System.out.println("5. Sair");
            System.out.print("\nEscolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu o método recursivo 1");
                    System.out.println("Leia do teclado as informações necessárias");
                    System.out.println("Chame o método recursivo e apresente o resultado:");
                    System.out.println("Resultado do metodo recursivo 1: " + metodo1());
                    break;
                case 2:
                    System.out.println("Você escolheu o método recursivo 2");
                    System.out.println("Leia do teclado as informações necessárias");
                    System.out.println("Chame o método recursivo e apresente o resultado:");
                    System.out.println("Resultado do metodo recursivo 2: " + metodo2());
                    break;
                case 3:
                    System.out.println("Você escolheu o método recursivo 3");
                    System.out.println("Leia do teclado as informações necessárias");
                    System.out.println("Chame o método recursivo e apresente o resultado:");
                    System.out.println("Resultado do metodo recursivo 3: " + metodo3());
                    break;
                case 4:
                    System.out.print("Digite o tamanho do vetor: ");
                    int n = scanner.nextInt();
                    int[] vet = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        vet[i] = scanner.nextInt();
                    }
                    System.out.print("Digite o numero a ser encontrado: ");
                    int x = scanner.nextInt();
                    System.out.println("Numero " + x + " -> posicao: " + encontrar(vet, n, x));
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }

    public static int metodo1() {
        return 1;
    }

    public static double metodo2() {
        return 3.1415;
    }

    public static String metodo3() {
        return "resultado 3";
    }

    public static int encontrar(int[] A, int n, int x){
        int pos = -1;
        if(n>0){
            if(A[n-1] == x){
                pos = n-1;
            } else {
                pos = encontrar(A, n-1, x);
            }
        }
        return pos;
    }

}
