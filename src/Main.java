import entities.ElementoMultimediale;
import entities.Immagine;
import entities.RegistrazioneAudio;
import entities.Video;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // CREAZIONE ELEMENTI MULTIMEDIALI

        Scanner scanner = new Scanner(System.in);

        ElementoMultimediale[] listaMedia = new ElementoMultimediale[5];


        for (int i = 0; i < listaMedia.length; i++) {
            System.out.println("Inserisci il titolo dell'elemento multimediale n°" + (i + 1));
            String titoloMedia = scanner.nextLine();
            System.out.println("Ora la tipologia di media : 'immagine' per immagine, 'video' per video, 'registrazione' per registrazione audio");
            String tipologiaMedia = scanner.nextLine();
            switch (tipologiaMedia.toLowerCase()) {
                case "immagine": {
                    listaMedia[i] = new Immagine(titoloMedia, 3);
                    break;
                }
                case "video": {
                    listaMedia[i] = new Video(titoloMedia, 3, 3, 3);
                    System.out.println("tipologia : " + tipologiaMedia + ", titolo media : " + listaMedia[i].getTitolo());
                    break;
                }
                case "registrazione": {
                    listaMedia[i] = new RegistrazioneAudio(titoloMedia, 3, 4);
                    System.out.println("tipologia : " + tipologiaMedia + ", titolo media : " + listaMedia[i].getTitolo());
                    break;
                }
                default: {
                    System.err.println("tipologia non ammessa");
                    i --;
                }
            }

        }
        lettoreMultimediale(listaMedia);
    }
    public static void lettoreMultimediale(ElementoMultimediale[] lista) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quale oggetto eseguire?");
        int scelta = scanner.nextInt();
        switch (scelta) {
            case 1 : {
                funzioneIstanza(0, lista);
                lettoreMultimediale(lista);
                break;
            }
            case 2 : {
                funzioneIstanza(1, lista);
                lettoreMultimediale(lista);
                break;
            }
            case 3 : {
                funzioneIstanza(2, lista);
                lettoreMultimediale(lista);
                break;
            }
            case 4 : {
                funzioneIstanza(3, lista);
                lettoreMultimediale(lista);
                break;
            }
            case 5 : {
                funzioneIstanza(4, lista);
                lettoreMultimediale(lista);
                break;
            }
            case 0 : {
                System.out.println("Ok il programma termina adesso");
                break;
            }
            default: {
                System.err.println("errore, numero non presente");
                lettoreMultimediale(lista);
            }
        }
    }
    public static void funzioneIstanza(int num, ElementoMultimediale[] array) {
            if (array[num] instanceof Immagine) {
                System.out.println("Tipologia media : Immagine. "
                        + "Titolo elemento : " + array[num].getTitolo()
                        + ", luminosità : " + ((Immagine) array[num]).getLuminosita());
            } else if (array[num] instanceof RegistrazioneAudio) {
                System.out.println("Tipologia media : Registrazione audio. "
                        + "Titolo elemento : " + array[num].getTitolo()
                        + ", volume : " + ((RegistrazioneAudio) array[num]).getVolume()
                        + ", durata : " + ((RegistrazioneAudio) array[num]).getDurata());
            } else if (array[num] instanceof Video) {
                System.out.println("Tipologia media : Video. "
                        + "Titolo elemento : "+ array[num].getTitolo()
                        + ", luminosità : " + ((Video) array[num]).getLuminosita()
                        + ", volume : " + ((Video) array[num]).getVolume()
                        + ", durata : " + ((Video) array[num]).getDurata());
            }
    }
}
