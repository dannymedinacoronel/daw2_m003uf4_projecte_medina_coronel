package fje.edu;

public class LlibrePaper extends Llibre {

    private String dataImpressio;
    private int numPagines;

    public LlibrePaper(int isbn, String titol, String autor, int stock, ETipusLlibre tipusLlibre, String dataImpressio, int numPagines) {
        super(isbn, titol, autor, stock, tipusLlibre);
        this.dataImpressio = dataImpressio;
        this.numPagines = numPagines;
    }


    public String getDataImpressio() {
        return dataImpressio;
    }

    public void setDataImpressio(String dataImpressio) {
        this.dataImpressio = dataImpressio;
    }

    public int getNumPagines() {
        return numPagines;
    }

    public void setNumPagines(int numPagines) {
        this.numPagines = numPagines;
    }
}
