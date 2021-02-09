package banque.entites;

public class TestBanque {
    public static void main(String[] args) {
        Compte my_compte1 = new Compte(7229330);
        Compte my_compte2 = new Compte(722430);
        Compte my_compte3 = new Compte(7223830);

        System.out.println(my_compte1);
        System.out.println(my_compte2);
        System.out.println(my_compte3);
        //Que constatez-vous ?
        //On voit qu'on affiche l'emplacement mémoire de l'instance de l'object de la classe

        System.out.println(my_compte1.getNumero_compte());
        System.out.println(my_compte2.getNumero_compte());
        System.out.println(my_compte3.getNumero_compte());

    }



}
