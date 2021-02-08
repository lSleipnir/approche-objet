package entites;

public class AdressePostale {
    private int numero_rue;
    private String libelle_rue;
    private int code_postal;
    private String ville;

    public AdressePostale(int numero_rue, String libelle_rue, int code_postal, String ville) {
        this.numero_rue = numero_rue;
        this.libelle_rue = libelle_rue;
        this.code_postal = code_postal;
        this.ville = ville;
    }
}
