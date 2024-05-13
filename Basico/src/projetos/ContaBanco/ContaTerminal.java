package projetos.ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {


    public static void main (String[] args) {
        try (
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
                System.out.println("Digite o nome: ");
                String nome = scanner.next();

                System.out.println("Digite o Nº da sua Agencia: ");
                String agencia = scanner.next();

                System.out.println("Digite o Nº da sua conta: ");
                int numero = scanner.nextInt();

                System.out.println("Digite o seu saldo bancario: ");
                double saldo = scanner.nextDouble();


                System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
            }
    }

    
}
