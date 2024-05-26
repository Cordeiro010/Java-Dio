package ControleDeFluxo.Repetição;

// ExemploWhile.java
import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
public static void main(String[] args) {
	double mesada = 50.0;
    int contadorDoces = 1;
        while(mesada>0) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            
            System.out.println("Doce do valor nº "+ contadorDoces +" :" + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;

            contadorDoces++;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
        /*
        * Não se preocupe quanto a formatação de valores
        * Iremos explorar os recursos de formatação em breve !!
        */
   }
   private static double valorAleatorio() {
	return ThreadLocalRandom.current().nextDouble(2, 8);
   }

     //estrutura do controle de fluxo while

     //while (expressão booleana de validação)
{
     // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}


}

