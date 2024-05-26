package ControleDeFluxo.Repetição;

public class EstruturaFor {
    //estrutura do controle de fluxo for

     // for (bloco de inicialização; expressão booleana de validação; bloco de atualização) {
     // comando que será executado até que a 
     // expressão de validação torne-se falsa 

     // ExemploFor.java

	public static void main(String[] args) {
		for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}
        System.err.println("Primeiro metodo!");
        
        // Outras estruturas
        
        //estrutura 1
        for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
        }
        System.err.println("Segundo metodo!");
        
        //estrutura 2
        //o que importa é somente o bloco condicional
        int carneirinhos = 1;
        for( ; carneirinhos <=20; ) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
            carneirinhos ++;
        }
        System.err.println("Terceiro metodo!");

    //for( somente 1x ; deve ser uma expresão boolean; acontecerá a cada final da execução ) { }
    }



}

