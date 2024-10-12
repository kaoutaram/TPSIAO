public class Operation {
    private double montant;
    private OperationExecution operationExecution;

    public Operation(double montant, OperationExecution operationExecution) {
        this.montant = montant;
        this.operationExecution = operationExecution;
    }

    public boolean execute(Compte compte) {
        return this.operationExecution.execute(compte, this.montant);
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
