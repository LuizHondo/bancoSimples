import java.util.Scanner;

public class bancoVirtual {
    public static void main(String[] args) {
        String apresentacao = """
                Operações
                                
                1- Consultar saldos
                2- Depositar valor
                3- Sacar valor
                4- Sair
                                
                Digite a opção desejada:\n
                """;

        Scanner leitura = new Scanner(System.in);
        int opcao = 0;
        double saldo = 1000.09; //saldo inicial

        while(opcao != 4) {
            System.out.println(apresentacao);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.format("Seu saldo é de: R$%.2f\n", saldo);
            }
            if (opcao == 2) {
                System.out.println("Informe o valor a ser depositado: \n");
                double vlDeposito = leitura.nextDouble();
                System.out.format("Depositando R$%.2f\n", vlDeposito);
                System.out.format("O saldo atual é de R$%.2f\n", saldo = saldo + vlDeposito);
            }
            if (opcao == 3) {
                System.out.println("Informe o valor a ser sacado: \n");
                double vlSaque = leitura.nextDouble();
                if (vlSaque < saldo) {
                    System.out.format("Sacando R$%.2f\n", vlSaque);
                    System.out.format("O saldo atual é de R$%.2f\n", saldo = saldo - vlSaque);
                }
                else {
                    System.out.println("Seu saldo é insuficiente");
                }

            }
            if (opcao == 4) {
                System.out.println("Encerrando...\n");
            }
            if (opcao <= 0 || opcao > 4) {
                System.out.println("Entrada inválida\n");
            }
        }
        System.out.println("Programa banco encerrado\n");
    }
}
//    Inicializar dados do cliente
//        Menu de opções
//        Visualização do saldo
//        Enviar valor
//        Receber valor
