package smartTV;
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanaL){
        canal = novoCanaL;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.err.println("Aumentando volume para:" + volume);
    }
    
    public void diminuirVolume(){
        volume--;
        System.err.println("Diminuindo volume para:" + volume);
    }

}
