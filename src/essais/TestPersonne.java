package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

    public static void main(String[] args) {
        AdressePostale new_adress = new AdressePostale(67, "Rue du Ruisseau Bleu", 67000, "Strasbourg");
        Personne personne_1 = new Personne("Casciola", "Loulou", new_adress);

        System.out.println(personne_1.getNom());
    }

}
