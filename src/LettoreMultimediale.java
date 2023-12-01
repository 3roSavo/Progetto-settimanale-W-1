import entities.ElementoMultimediale;
import entities.Immagine;
import entities.RegistrazioneAudio;
import entities.Video;

import java.util.Scanner;

public class LettoreMultimediale {

    public static void main(String[] args) {

        // CREAZIONE ELEMENTI MULTIMEDIALI

        Scanner scanner = new Scanner(System.in);

        ElementoMultimediale[] listaMedia = new ElementoMultimediale[5];
        listaMedia[0] = new Immagine("foto cane", 4);
        listaMedia[1] = new Video("gag di Paolo",6,8,5);
        listaMedia[2] = new RegistrazioneAudio("mia prova col basso", 7,6);
        listaMedia[3] = new Immagine("montagne innevate", 2);
        listaMedia[4] = new RegistrazioneAudio("prova coro",4,10);

        System.out.println("Quale oggetto eseguire?");
        int nomeOggetto = Integer.parseInt(scanner.nextLine()) -1 ;
        System.out.println("hai scelto l'oggetto numero " + (nomeOggetto + 1));
        System.out.println("Titolo : " + listaMedia[nomeOggetto].getTitolo());

        // Sinceramente non saprei come gestire lo scanner per completare il compito


        /*Immagine fotoGatto = new Immagine("gatto morbidoso", 4);
        RegistrazioneAudio provaChitarra = new RegistrazioneAudio("where is my mind", 3,5);
        Video videoGoPro = new Video("acqua cristallina di Zante", 4, 2, 5);

        //STAMPE DI PROVA
        System.out.println("la foto si chiama : '" + fotoGatto.getTitolo() + "', con luminosità di : " + fotoGatto.getLuminosita());
        fotoGatto.show();

        provaChitarra.play();

        fotoGatto.diminuisciLuminosita(3);
        fotoGatto.show();

        videoGoPro.play();

        */
    }
    public static void qualeOggettoEseguire() {}
}
