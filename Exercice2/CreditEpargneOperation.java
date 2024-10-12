public class CreditEpargneOperation implements OperationExecution {

    @Override
    public boolean execute(Compte compte, double montant) {
        if (compte.getMontant() >= montant * 0.1 &&
                java.time.LocalDate.now().getYear() > Integer.parseInt(compte.getDateCreation().split("/")[2])) {
            compte.setMontant(compte.getMontant() - montant * 0.1);
            return true;
        }
        return false;
    }
}
