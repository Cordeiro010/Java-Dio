package ControleDeFluxo.Repetição;

public class ExemploBreakContinue {
    
    public static void main(String[] args) {
	
	for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			break;
		
		System.out.println(numero);
		
	}
	//Qual a saída no console ? 1 2

    }

    /*public static void main(String[] args) {
	
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;
            
            System.out.println(numero);
            
        }
        //Qual a saída no console ? 1 2 4 5
    
        }*/

}
