package entities;

public class RegistrazioneAudio extends ElementoMultimediale {
    private int durata;
    private int volume;

    //COSTRUTTORI

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }


    //GETTER E SETTER

    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }

    public void abbassaVolume(int decrementoVolume) {
        this.volume -= decrementoVolume;
    }
    public void alzaVolume(int incrementoVolume) {
        this.volume += incrementoVolume;
    }

    // METODI

    public void play() {
        System.out.println(repeatTitle(durata, getTitolo()) + stampaVolume(volume));
    }


}