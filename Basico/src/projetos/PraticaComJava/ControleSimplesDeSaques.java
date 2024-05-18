package projetos.PraticaComJava;

import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double limiteDiario = scanner.nextDouble();
            double saque = scanner.nextDouble();
            //System.out.println("Digite o limite diário de saque:");
            for (;saque > 1 && limiteDiario > 1; saque = scanner.nextDouble() ){
                
                if (saque <= limiteDiario) {
                    limiteDiario -= saque;
                    System.out.println("Saque realizado. Limite restante: " + limiteDiario);
                    

                }else if (saque > limiteDiario) {
                    System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                    break;
                }
                
            }
            
            if (saque == 0 ){
                System.out.println("Transacoes encerradas.");
            }
            scanner.close();
        }      
    }
}