package fje.edu;

public class Vinil {
    private String autor;
    private String titol;
    private int duracio;
    private int stock;

    public Vinil(String autor, String titol, int duracio, int stock) {
        this.autor = autor;
        this.titol = titol;
        this.duracio = duracio;
        this.stock = stock;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public int getDuracio() {
        return duracio;
    }

    public void setDuracio(int duracio) {
        this.duracio = duracio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
