public class Main {
    public static void main(String[] args) {
        // Créer un compte courant avec la stratégie de débit et de crédit
        Compte compteCourant = new Compte("1", "12/10/2024");

        // Ajouter une opération de débit
        Operation debitCourant = new Operation(100, new DebitCourantOperation());
        compteCourant.addOperation(debitCourant);

        // Ajouter une opération de crédit
        Operation creditCourant = new Operation(50, new CreditCourantOperation());
        compteCourant.addOperation(creditCourant);

        System.out.println("Montant du compte courant: " + compteCourant.getMontant());

        // Créer un compte épargne avec la stratégie de débit et de crédit
        Compte compteEpargne = new Compte("2", "12/10/2024");

        // Ajouter une opération de débit pour le compte épargne
        Operation debitEpargne = new Operation(200, new DebitEpargneOperation());
        compteEpargne.addOperation(debitEpargne);

        // Ajouter une opération de crédit pour le compte épargne
        Operation creditEpargne = new Operation(100, new CreditEpargneOperation());
        compteEpargne.addOperation(creditEpargne);

        System.out.println("Montant du compte épargne: " + compteEpargne.getMontant());
    }
}
