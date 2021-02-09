package essais;

import banque.entites.Credit;
import banque.entites.Debit;
import banque.entites.Operation;

public class TestOperation {

    public static void main(String[] args) {
        //créez  un  tableau  d’opérations  avec au  moins  4  opérations  de  crédits  et  de  débits dans le tableau
        Operation[] tableau_operation = {
                new Credit("23/03/20", 6892),
                new Debit("21/04/20", 22223),
                new Credit("24/03/20", 3444),
                new Debit("22/04/20", 77892)
        };

        double solde = 0;

        for (Operation oper:tableau_operation) {
            System.out.println(oper.getDate_operation());
            System.out.println(oper.getMontant_operation());
            System.out.println(oper.getType());
            solde = oper.getType().equals("CREDIT") ? solde + oper.getMontant_operation() : solde - oper.getMontant_operation();
        }
        System.out.println(solde);
    }
}
