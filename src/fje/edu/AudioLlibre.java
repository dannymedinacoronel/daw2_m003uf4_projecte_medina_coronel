package fje.edu;

public class AudioLlibre extends Llibre{

    private String nomNarrador;


    public AudioLlibre(int isbn, String titol, String autor, int stock, ETipusLlibre tipusLlibre, String nomNarrador) {
        super(isbn, titol, autor, stock, tipusLlibre);
        this.nomNarrador = nomNarrador;

    }

    public String getNomNarrador() {
        return nomNarrador;
    }

    public void setNomNarrador(String nomNarrador) {
        this.nomNarrador = nomNarrador;
    }

}
