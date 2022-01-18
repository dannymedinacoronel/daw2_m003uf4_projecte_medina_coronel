package fje.edu;

public class Web {
    private String id;
    private String nomWeb;
    private String nomEmpresa;
    private String domiciliSocial;
    private int telefon;

    public Web(String id, String nomWeb, String nomEmpresa, String domiciliSocial, int telefon) {
        this.id = id;
        this.nomWeb = nomWeb;
        this.nomEmpresa = nomEmpresa;
        this.domiciliSocial = domiciliSocial;
        this.telefon = telefon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomWeb() {
        return nomWeb;
    }

    public void setNomWeb(String nomWeb) {
        this.nomWeb = nomWeb;
    }

    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

    public String getDomiciliSocial() {
        return domiciliSocial;
    }

    public void setDomiciliSocial(String domiciliSocial) {
        this.domiciliSocial = domiciliSocial;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }
}
