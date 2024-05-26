package ControleDeFluxo.Condicionais;
public class CondicionalSimples {

    // CaixaEletronico.java
public static class CaixaEletronico {
    public static void main (String[] args) {

       double saldo = 25.0;
       double valorSolicitado = 26.0;

       if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;

        System.out.println(saldo);

        /*  caso contrario
        public static void main (String[] args) {

            double saldo = 25.0;
            double valorSolicitado = 17.0;
     
            if(valorSolicitado < saldo)
             saldo = saldo - valorSolicitado;
     
             System.out.println(saldo);
             
             R= 8.0
             */

    }
}
}