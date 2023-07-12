package iphone.celularMultifuncional;

import iphone.apps.browser.NavegadorInternet;
import iphone.apps.ipod.ReprodutorMusical;
import iphone.apps.phone.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    public void exibirPagina() { System.out.println("EXIBINDO PÁGINA via iphone"); }

    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO ABA via iphone");
    }

    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA via iphone");
    }

    public void tocar() {
        System.out.println("TOCANDO MÚSICA via iphone");
    }
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA via iphone");
    }


    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA via iphone");
    }

    public void ligar() {
        System.out.println("LIGAR via iphone");
    }

    public void atender() {
        System.out.println("ATENDER via iphone");
    }

    public void iniciarCorrerioVoz() {
        System.out.println("INICIAR CORREIO DE VOZ via iphone");
    }
}
