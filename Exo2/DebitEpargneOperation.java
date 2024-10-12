public class DebitEpargneOperation implements OperationExecution {

    @Override
    public boolean execute(Compte compte, double montant) {
        compte.setMontant(compte.getMontant() + montant * 0.05);
        return true;
    }
}
