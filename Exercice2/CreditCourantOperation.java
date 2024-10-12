public class CreditCourantOperation implements OperationExecution {

    @Override
    public boolean execute(Compte compte, double montant) {
        if (compte.getMontant() >= montant) {
            compte.setMontant(compte.getMontant() - montant);
            return true;
        }
        return false;
    }
}
