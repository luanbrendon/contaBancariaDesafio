import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Cliente";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("*********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*********************");

      String menu = """
              *** Digite sua opção ***
              1 - Saldo
              2 - Transferir
              3 - Receber valor
              4 - Sair
              """;
        Scanner leitura = new Scanner(System.in);
        while ( opcao!= 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é de: " + saldo +"\n");
            } else if (opcao == 2) {
                System.out.println("Digite o valor da sua transferência: ");
                double valor = leitura.nextDouble();
                System.out.println("O valor de " + valor + " foi transferido\n");
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência");
                }else {
                    saldo -= valor;
                }
            } else if (opcao == 3) {
                System.out.println("Digite o valor do depósito: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("O valor de " + valor + " foi depositado\n");

            }
        }
    }
}