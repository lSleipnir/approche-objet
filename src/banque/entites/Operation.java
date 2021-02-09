package banque.entites;

public abstract class Operation {

    //la date de l’opération (au formatString pour l’instant)ii.le montant de l’opération
    protected String date_operation;
    protected double montant_operation;


    public Operation(String date_operation, double montant_operation) {
        this.date_operation = date_operation;
        this.montant_operation = montant_operation;
    }

    public String getDate_operation() {
        return date_operation;
    }

    public double getMontant_operation() {
        return montant_operation;
    }

    public abstract String getType();

}
