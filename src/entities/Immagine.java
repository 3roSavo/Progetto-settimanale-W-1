package entities;

public class Immagine extends ElementoMultimediale {
    private int luminosita;


    //COSTRUTTORI

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }


    //GETTER E SETTER

    public int getLuminosita() {
        return luminosita;
    }

    public void aumentaLuminosita(int incrementaLuminosita) {
        this.luminosita += incrementaLuminosita;
    }
    public void diminuisciLuminosita(int decrementaLuminosita) {
        this.luminosita -= decrementaLuminosita;
    }


// METODI
    public void show() {
        System.out.println("titolo immagine : " + getTitolo() + ", luminosità : " + stampaLuminosita(luminosita));
    }


}






