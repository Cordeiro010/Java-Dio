package PraticaComJava;

import java.util.Scanner;

// Aqui é definido uma classe chamada VerificadorElegibilidadeConta:
public class VerificadorElegibilidadeConta { 

    public static void main(String[] args) { 
        System.out.print("Qual sua idade: ");
        Scanner scanner = new Scanner(System.in); 

        int idade = scanner.nextInt(); 

// TODA: Verifique se a idade é maior ou igual a 18 e imprima uma mensagem informando que o usuário é elegível para criar uma conta bancária:
       if (idade >= 18) {
          System.out.print("Voce esta elegivel para criar uma conta bancaria.");
       } else {
          System.out.print("Voce nao esta elegivel para criar uma conta bancaria.");
       }

// Fechamos o objeto Scanner para liberar os recursos:
        scanner.close(); 
    }
}