package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

    AdressePostale new_adress = new AdressePostale(67, "Rue du Ruisseau Bleu", 67000, "Strasbourg");
    Personne personne_1 = new Personne("Casciola", "Loulou", new_adress);

}
