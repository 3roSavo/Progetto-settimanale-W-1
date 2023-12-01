package entities;

public class Video {
    private String titolo;
    private int durata;
    private int volume;
    private int luminosita;

    //COSTRUTTORI

    public Video(String titolo, int durata, int volume, int luminosita) {
        this.titolo = titolo;
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    //GETTER E SETTER

    public String getTitolo() {
        return titolo;
    }

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

        String stampaTitoli = "";
        String numeroPuntiEsclamativi = "";
        String luminositaInAsterischi = "";


        switch (this.durata) {
            case 1 : {
                stampaTitoli = this.titolo;
                break;
            }
            case 2 : {
                stampaTitoli = this.titolo + this.titolo;
                break;
            }
            case 3 : {
                stampaTitoli = this.titolo + this.titolo + this.titolo;
                break;
            }
            case 4 : {
                stampaTitoli = this.titolo + this.titolo + this.titolo + this.titolo;
                break;
            }
            case 5 : {
                stampaTitoli = this.titolo + this.titolo + this.titolo + this.titolo + this.titolo;
                break;
            }
            case 6 : {
                stampaTitoli = this.titolo + this.titolo + this.titolo + this.titolo + this.titolo + this.titolo;
                break;
            }
            case 7 : {
                stampaTitoli = this.titolo + this.titolo + this.titolo + this.titolo + this.titolo + this.titolo + this.titolo;
                break;
            }
            default: {
                stampaTitoli = "durata non compresa tra 1 e 7";
            }
        }



        if (this.volume == 0) {
            numeroPuntiEsclamativi = "/";
        } else if (this.volume == 1) {
            numeroPuntiEsclamativi = "!";
        } else if (this.volume == 2) {
            numeroPuntiEsclamativi = "!!";
        } else if (this.volume == 3) {
            numeroPuntiEsclamativi = "!!!";
        } else if (this.volume == 4) {
            numeroPuntiEsclamativi = "!!!!";
        } else if (this.volume == 5) {
            numeroPuntiEsclamativi = "!!!!!";
        } else {
            numeroPuntiEsclamativi = "volume non compreso tra 0 e 5";
        }


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

        System.out.println(stampaTitoli + numeroPuntiEsclamativi + luminositaInAsterischi);



    }




}