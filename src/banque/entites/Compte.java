package banque.entites;

public class Compte {

    private static int i = 1;   //faut mettre static car sinon il le reload par object. static: lié à la classe et non à l'object
    // variable static ne dépend pas de l'instance de la classe
    private int numero_de_compte;
    private double solde_du_compte;

    //à chaque création de compte, définir automatiquement un numéro de compte incrémenté (1, 2, 3 ..)
    public Compte(double solde_du_compte) {
        this.solde_du_compte = solde_du_compte;
        i++;
        this.numero_de_compte = i;
    }

    public int getNumero_compte() {
        return numero_de_compte;
    }

    @Override
    public String toString() {
        return "Le numero de compte " + this.numero_de_compte ;
    }
}
