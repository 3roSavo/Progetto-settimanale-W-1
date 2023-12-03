package entities;

public abstract class ElementoMultimediale {
    private String titolo;

    //COSTRUTTORE

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    //GETTER

    public String getTitolo() {
        return titolo;
    }



    //METODI STATICI

    public static String repeatTitle(int durata, String titolo) {
        String stampaTitoli = "";
        for (int i = 0; i < durata; i++) {
            stampaTitoli += titolo;
        }
        return stampaTitoli;
    }

    public String stampaVolume(int volume) {
        String numeroPuntiEsclamativi = "";
        for (int i = 0; i < volume; i++) {
            numeroPuntiEsclamativi += "!";
        }
        return numeroPuntiEsclamativi;
    }

    public static String stampaLuminosita(int luminosita) {
        String luminositaInAsterischi = "";
        for (int i = 0; i < luminosita; i++) {
            luminositaInAsterischi += "*";
        }
        return luminositaInAsterischi;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
}

