package projetos.PraticaComJava;

import java.util.Scanner;

public class SimulacaoBancaria {
    private double saldo;

    public SimulacaoBancaria(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public double consultarSaldo(){
        return this.saldo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimulacaoBancaria conta = new SimulacaoBancaria (0);
            
         // Loop infinito para manter o programa em execução até que o usuário decida sair
         while (true) { 
    
            System.out.println("");
            System.out.println("");
            System.out.println("Bem vindo ao Banco DIO.");
            System.out.println("Menu:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Encerrar");
            System.out.println("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            
            // todo: Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            if (opcao == 1 ){
                System.out.println("Digite o valor a ser depositado: ");
                double valorDeposito = scanner.nextDouble();
                conta.depositar(valorDeposito);
                System.out.printf("Saldo atual:  %.1f\n", conta.consultarSaldo());
            } else if (opcao == 2){
                System.out.println("Digite o valor a ser sacado: ");
                double valorSaque = scanner.nextDouble();
                if (conta.sacar(valorSaque)){
                   System.out.printf("Saldo atual:  %.1f\n", conta.consultarSaldo());
                } else {
                    System.out.println("Saldo insuficiente.");
                }
            } else if (opcao == 3){
                System.out.printf("Saldo atual:  %.1f\n", conta.consultarSaldo());
            } else if (opcao == 0){
               System.out.println("Programa encerrado.");
                break;
            // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
            } else {
                System.out.println("Opção inválida!");
            }
            
        }

        scanner.close();
    }
}


