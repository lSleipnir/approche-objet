package entites;

public class Personne {
    private String nom;
    private String prenom;
    private AdressePostale postal_adress;

    public Personne(String nom, String prenom, AdressePostale postal_adress) {
        this.nom = nom;
        this.prenom = prenom;
        this.postal_adress = postal_adress;
    }
}
