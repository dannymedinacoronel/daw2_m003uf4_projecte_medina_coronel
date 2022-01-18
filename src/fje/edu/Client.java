package fje.edu;

public abstract class Client {
    protected String username;
    protected String nom;
    protected String cognoms;
    protected ETipusClient tipusClient;

    public Client(String username, String nom, String cognoms, ETipusClient tipusClient) {
        this.username = username;
        this.nom = nom;
        this.cognoms = cognoms;
        this.tipusClient = tipusClient;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public ETipusClient getTipusClient() {
        return tipusClient;
    }

    public void setTipusClient(ETipusClient tipusClient) {
        this.tipusClient = tipusClient;
    }
}
