package entites;

import java.util.Locale;

public class Personne {
    private String nom;
    private String prenom;
    private AdressePostale postal_adress;

    public Personne(String nom, String prenom, AdressePostale postal_adress) {
        this.nom = nom;
        this.prenom = prenom;
        this.postal_adress = postal_adress;
    }

    public String getNom() {
        return nom.toUpperCase();
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public AdressePostale getPostal_adress() {
        return postal_adress;
    }

    public void setPostal_adress(AdressePostale postal_adress) {
        this.postal_adress = postal_adress;
    }
}
