package fje.edu;

public class EscolaMusica extends Client {

   private  Vinil  vinilAlquilat;

    public EscolaMusica(String username, String nom, String cognoms, ETipusClient tipusClient) {
        super(username, nom, cognoms, tipusClient);
    }

    public Vinil getVinilAlquilat() {
      return vinilAlquilat;
   }

    public void setVinilAlquilat(Vinil vinilAlquilat) {
      this.vinilAlquilat = vinilAlquilat;
   }
}
