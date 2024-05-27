package iphoneComUML;

import iphoneComUML.AparelhoTelefonico.AparelhoTelefonico;
import iphoneComUML.ReprodutorMusical.ReprodutorMusical;
import iphoneComUML.NavegadorInternet.NavegadorInternet;

public class iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
        System.out.println("");
    }

   
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
        
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
        System.out.println("");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
        System.out.println("");
    }

    public static void main(String[] args) {
        iphone iphone = new iphone();
        System.out.println("Inicinado Iphone!");
        System.out.println("");

        
        iphone.selecionarMusica("Minha Música Favorita");
        iphone.tocar();
        iphone.pausar();

        
        iphone.ligar("+55 (00) 9-1234-5678");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        
        iphone.exibirPagina("http://DIO.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
