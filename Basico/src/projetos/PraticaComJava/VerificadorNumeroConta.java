package projetos.PraticaComJava;

import java.util.Scanner; 

public class VerificadorNumeroConta { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        String contaBancaria = scanner.next();
        scanner.close();
        try{
            if ( contaBancaria.length() !=8) {
                throw new IllegalAccessException("Numero de conta invalido. Digite exatamente 8 digitos.");
                                 
            }

            for (char c : contaBancaria.toCharArray()){
                if (!Character.isDigit(c)) {
                    throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
                }
            }

            System.out.println("Numero de conta valido.");

        } catch (IllegalAccessException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
    }
}