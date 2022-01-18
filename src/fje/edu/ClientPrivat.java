package fje.edu;

public class ClientPrivat  extends Client{
    private LlibrePaper llibreAlquilat;
    private AudioLlibre audiollibreAlquilat;

    public ClientPrivat(String username, String nom, String cognoms, ETipusClient tipusClient) {
        super(username, nom, cognoms, tipusClient);
    }

    public LlibrePaper getLlibreAlquilat() {
        return llibreAlquilat;
    }

    public void setLlibreAlquilat(LlibrePaper llibreAlquilat) {
        this.llibreAlquilat = llibreAlquilat;
    }

    public AudioLlibre getAudiollibreAlquilat() {
        return audiollibreAlquilat;
    }

    public void setAudiollibreAlquilat(AudioLlibre audiollibreAlquilat) {
        this.audiollibreAlquilat = audiollibreAlquilat;
    }
}
