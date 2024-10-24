import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;
        double saldoAtual = 2500.00;
        double valorAReceber = 0;
        double valorATransferir = 0;

        System.out.println("""
                *****************************************
                Dados iniciais do cliente:
                
                Nome:                       Kauan A. Lima
                Tipo de conta:              Corrente
                Saldo inicial:              R$ 2500,00
                *****************************************
                """);

        while (opcao != 4) {
            System.out.println("""
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Digite a opção desejada:""");
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O saldo atual é R$ " + saldoAtual + "\n");
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    valorAReceber = leitura.nextDouble();
                    saldoAtual += valorAReceber;
                    valorAReceber = 0;
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir: ");
                    valorATransferir = leitura.nextDouble();
                    if (saldoAtual > valorATransferir){
                        saldoAtual -= valorATransferir;
                        valorATransferir = 0;
                    }else {
                        System.out.println("Valor informado maior que o saldo atual!!!\n");
                        valorATransferir = 0;
                    }
                    break;
                case 4:
                    System.out.println("Operação finalizada");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }


}
