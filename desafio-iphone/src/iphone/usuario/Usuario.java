package iphone.usuario;

import iphone.celularMultifuncional.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone();

        iphone1.tocar();
        iphone1.pausar();
        iphone1.selecionarMusica();
        System.out.println("");
        iphone1.exibirPagina();
        iphone1.atualizarPagina();
        iphone1.adicionarNovaAba();
        System.out.println("");
        iphone1.ligar();
        iphone1.atender();
        iphone1.iniciarCorrerioVoz();
    }
}
