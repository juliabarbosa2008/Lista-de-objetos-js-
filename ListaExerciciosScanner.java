import java.util.Scanner;

public class ListaExerciciosScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== Menu de Exercícios =====");
            System.out.println("1 - Lendo o nome do usuário");
            System.out.println("2 - Calculando a soma de dois números");
            System.out.println("3 - Calculando o IMC");
            System.out.println("4 - Calculando desconto de produto");
            System.out.println("5 - Avaliação escolar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite seu nome: ");
                    String nome = scanner.nextLine();
                    System.out.println("Olá, " + nome + "! Seja bem-vindo(a) ao laboratório de programação!");
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int num2 = scanner.nextInt();
                    int resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 3:
                    System.out.print("Digite seu peso (kg): ");
                    double peso = scanner.nextDouble();
                    System.out.print("Digite sua altura (m): ");
                    double altura = scanner.nextDouble();
                    double imc = peso / (altura * altura);
                    System.out.printf("Seu IMC é: %.2f\n", imc);
                    break;

                case 4:
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Digite o desconto (%): ");
                    double desconto = scanner.nextDouble();
                    double precoFinal = preco - (preco * desconto / 100);
                    System.out.printf("Preço final: %.2f\n", precoFinal);
                    break;

                case 5:
                    System.out.print("Digite a primeira nota: ");
                    double nota1 = scanner.nextDouble();
                    System.out.print("Digite a segunda nota: ");
                    double nota2 = scanner.nextDouble();
                    System.out.print("Digite a terceira nota: ");
                    double nota3 = scanner.nextDouble();

                    double media = (nota1 + nota2 + nota3) / 3;
                    System.out.printf("Média: %.1f\n", media);

                    if (media >= 7) {
                        System.out.println("Situação: Aprovado");
                    } else if (media >= 5) {
                        System.out.println("Situação: Recuperação");
                    } else {
                        System.out.println("Situação: Reprovado");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
