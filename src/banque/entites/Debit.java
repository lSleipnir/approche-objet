package banque.entites;

public class Debit  extends Operation {
    public Debit(String date_operation, double montant_operation) {
        super(date_operation, montant_operation);
    }

    public String getType(){
        return "DEBIT";
    }
}
