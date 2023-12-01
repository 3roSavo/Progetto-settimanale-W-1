import entities.Immagine;
import entities.RegistrazioneAudio;
import entities.Video;

public class LettoreMultimediale {

    public static void main(String[] args) {
        System.out.println("prova prova prova");

        // CREAZIONE ELEMENTI MULTIMEDIALI
        Immagine fotoGatto = new Immagine("gatto morbidoso", 4);
        RegistrazioneAudio provaChitarra = new RegistrazioneAudio("where is my mind", 3,5);
        Video videoGoPro = new Video("acqua cristallina di Zante", 4, 2, 5);




        //STAMPE DI PROVA
        System.out.println("la foto si chiama : '" + fotoGatto.getTitolo() + "', con luminosità di : " + fotoGatto.getLuminosita());
        fotoGatto.show();

        provaChitarra.play();

        fotoGatto.diminuisciLuminosita(3);
        fotoGatto.show();

        videoGoPro.play();






    }
}
