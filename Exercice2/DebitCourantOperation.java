public class DebitCourantOperation implements OperationExecution {

    @Override
    public boolean execute(Compte compte, double montant) {
        compte.setMontant(compte.getMontant() + montant);
        return true;
    }
}