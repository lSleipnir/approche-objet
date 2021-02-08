package banque.entites;

public class Compte {

    private double numero_compte;
    private double solde_du_compte;

    public Compte(int numero_compte, double solde_du_compte) {
        this.numero_compte = numero_compte;
        this.solde_du_compte = solde_du_compte;
    }
}
