import br.com.restaurante.estacionamento.models.Estacionamento;
import br.com.restaurante.estacionamento.models.Veiculo;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== ESTACIONAMENTO RESTAURANTE ======");
        estacionamento.mostrarEstacionamento();
        System.out.println("========================================");

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Estacionar um veículo");
            System.out.println("2 - Remover um veículo");
            System.out.println("3 - Verificar o estacionamento");
            System.out.println("4 - Sair");
            System.out.print("Digite sua opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Estacionar um veículo
                    System.out.print("\nDigite a placa do veículo: ");
                    String placa = scanner.next();
                    System.out.print("Digite o modelo do veículo: ");
                    String modelo = scanner.next();
                    System.out.print("Digite as horas estacionado: ");
                    int horas = scanner.nextInt();

                    Veiculo veiculo = new Veiculo(placa, modelo, horas);

                    if (estacionamento.temVagasDisponiveis()) {
                        estacionamento.adicionarVeiculo(veiculo);
                    } else {
                        System.out.println("O estacionamento está lotado!");
                    }
                    break;

                case 2:
                    // Remover um veículo
                    System.out.print("\nDigite a placa do veículo que deseja remover: ");
                    String placaRemover = scanner.next();

                    estacionamento.removerVeiculo(placaRemover);
                    break;

                case 3:
                    // Verificar o estacionamento
                    System.out.println("\n====== ESTACIONAMENTO RESTAURANTE ======");
                    estacionamento.mostrarEstacionamento();
                    System.out.println("========================================");
                    break;

                case 4:
                    // Sair
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
