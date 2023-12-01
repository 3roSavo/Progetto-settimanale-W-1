package entities;

public class Video extends ElementoMultimediale {
    private int durata;
    private int volume;
    private int luminosita;

    //COSTRUTTORI

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    //GETTER E SETTER

    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void abbassaVolume(int decrementoVolume) {
        this.volume -= decrementoVolume;
    }
    public void alzaVolume(int incrementoVolume) {
        this.volume += incrementoVolume;
    }
    public void aumentaLuminosita(int incrementaLuminosita) {
        this.luminosita += incrementaLuminosita;
    }
    public void diminuisciLuminosita(int decrementaLuminosita) {
        this.luminosita -= decrementaLuminosita;
    }


    // METODI

    public void play() {
        System.out.println(repeatTitle(this.durata, getTitolo()) + stampaVolume(this.volume) + stampaLuminosita(this.luminosita));
    }

}