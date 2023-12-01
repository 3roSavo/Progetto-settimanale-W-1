package entities;

public class Immagine {
    private String titolo;
    private int luminosita;


    //COSTRUTTORI

    public Immagine(String titolo, int luminosita) {
        this.titolo = titolo;
        this.luminosita = luminosita;
    }


    //GETTER E SETTER

    public String getTitolo() {
        return titolo;
    }

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

        String luminositaInAsterischi = "";

        switch (this.luminosita) {
            case 1 : {
                luminositaInAsterischi = "*";
                break;
            }
            case 2 : {
                luminositaInAsterischi = "**";
                break;
            }
            case 3 : {
                luminositaInAsterischi = "***";
                break;
            }
            case 4 : {
                luminositaInAsterischi = "****";
                break;
            }
            case 5 : {
                luminositaInAsterischi = "*****";
                break;
            }
            default: {
                luminositaInAsterischi = "ERRORE: inserire un valore tra 1 e 5";
            }
        }


        System.out.println("titolo immagine : " + this.titolo + ", luminosità : " + luminositaInAsterischi);
    }





}






