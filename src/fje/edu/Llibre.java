package fje.edu;


public abstract class Llibre {
    protected int isbn;
    protected  String titol;
    protected String autor;
    protected int stock;
    protected ETipusLlibre tipusLlibre ;

    public Llibre(int isbn, String titol, String autor, int stock, ETipusLlibre tipusLlibre) {
        this.isbn = isbn;
        this.titol = titol;
        this.autor = autor;
        this.stock = stock;
        this.tipusLlibre = tipusLlibre;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ETipusLlibre getTipusLlibre() {
        return tipusLlibre;
    }

    public void setTipusLlibre(ETipusLlibre tipusLlibre) {
        this.tipusLlibre = tipusLlibre;
    }



}