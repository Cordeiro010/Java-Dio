package projetos.DesafioControleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            boolean continueLoop = true;

            while (continueLoop) {
                System.out.print("\033[H\033[2J");
                System.out.println("Digite o primeiro número: ");
                int num1 = terminal.nextInt();
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Digite o segundo número");
                int num2 = terminal.nextInt();
                System.out.print("\033[H\033[2J");
                System.out.flush();

                try {
                    if (num1 > num2) {
                        throw new ParametrosInvalidosException("O segundo número deve ser menor que o primerio");
                    }
                
                    contar(num1, num2);
                    continueLoop = false;
                } catch (ParametrosInvalidosException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException{
        for (int i = num1; i <= num2 ; i++){
            System.out.println("Imprimindo o número" + i);
        }
    }

}

class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}