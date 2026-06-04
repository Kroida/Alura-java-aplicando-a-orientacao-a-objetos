import models.Audio;
import models.Musica;
import models.Podcast;

public class Main {
    static void main(String[] args) {
        Musica riot = new Musica("Riot", 04.00, "N sei", "Three days of Grace");

        riot.reproduzir();
        riot.pausar();
        riot.pausar();
        riot.curtir();
        riot.exibirClassificacao();

        System.out.println("");
        riot.exibirDetalhes();

        System.out.println("");
        riot.repetirMusica();
        riot.repetirMusica();

        System.out.println("");
        riot.exibirLetras();
        riot.definirLetras("If you feel so empty\n" +
                "So used up, so let down\n" +
                "If you feel so angry\n" +
                "So ripped off, so stepped on\n" +
                "You're not the only one\n" +
                "Refusing to back down\n" +
                "You're not the only one\n" +
                "So get up\n" +
                "\n" +
                "Let's start a riot, a riot\n" +
                "Let's start a riot\n" +
                "Let's start a riot, a riot\n" +
                "Let's start a riot\n" +
                "\n" +
                "If you feel so filthy\n" +
                "So dirty, so fucked up\n" +
                "If you feel so walked on\n" +
                "So painful, so pissed off\n" +
                "You're not the only one\n" +
                "Refusing to go down\n" +
                "You're not the only one\n" +
                "So get up\n" +
                "\n" +
                "Let's start a riot, a riot\n" +
                "Let's start a riot\n" +
                "Let's start a riot, a riot\n" +
                "Let's start a riot\n" +
                "\n" +
                "If you feel so empty\n" +
                "So used up, so let down\n" +
                "If you feel so angry\n" +
                "Just get up\n" +
                "\n" +
                "Let's start a riot, a riot\n" +
                "Let's start a riot\n" +
                "Let's start a riot, a riot\n" +
                "Let's start a riot\n" +
                "\n" +
                "Let's start a riot, a riot\n" +
                "Let's start a riot\n" +
                "Let's start a riot, a riot\n" +
                "Let's start a riot\n" +
                "\n" +
                "Let's start a riot, a riot\n" +
                "Let's start a riot");
        riot.exibirLetras();

        System.out.println("");
        Podcast xandao = new Podcast("Entrevistando o Xandão", 125, "Flow Podcast");
        xandao.reproduzir();
        xandao.pausar();
        xandao.pausar();
        xandao.curtir();
        xandao.exibirClassificacao();

        System.out.println("");
        xandao.exibirDetalhes();

        System.out.println("");
        xandao.aumentarVelocidade();
        xandao.diminuirVelocidade();
        xandao.avancarSegundos(50.0);
        xandao.avancarSegundos();
        xandao.voltarSegundos(2.0);
        xandao.voltarSegundos();
    }
}
