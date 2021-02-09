package banque.entites;

public class CompteTaux extends Compte {

    private double taux_de_remuneration;

    public CompteTaux(double solde_du_compte, double taux_de_remuneration) {
        super(solde_du_compte);
        this.taux_de_remuneration = taux_de_remuneration;
    }

    @Override
    public String toString() {
        return super.toString() + " taux de remuneration est : " +  this.taux_de_remuneration;
    }

}
