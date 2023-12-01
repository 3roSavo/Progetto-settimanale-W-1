package entities;

public class RegistrazioneAudio {
    private String titolo;
    private int durata;
    private int volume;

    //COSTRUTTORI

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        this.titolo = titolo;
        this.durata = durata;
        this.volume = volume;
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

    public void abbassaVolume(int decrementoVolume) {
        this.volume -= decrementoVolume;
    }
    public void alzaVolume(int incrementoVolume) {
        this.volume += incrementoVolume;
    }



    // METODI

    public void play() {
        String stampaTitoli = "";
        String numeroPuntiEsclamativi = "";
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


        System.out.println(stampaTitoli + numeroPuntiEsclamativi);
    }


}