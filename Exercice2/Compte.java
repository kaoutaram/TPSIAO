import java.util.ArrayList;

public class Compte {
    private ArrayList<Operation> operations;
    private String id;
    private String dateCreation;
    private double montant;
    private OperationExecution operationExecution; // Remplacement de OperationStrategy par OperationExecution

    public Compte(String id, String dateCreation) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.operations = new ArrayList<>();
        this.montant = 0;
    }

    public boolean addOperation(Operation operation) {
        if (operation.execute(this)) {
            this.operations.add(operation);
            return true;
        }
        return false;
    }

    // Getters et setters
    public String getDateCreation() {
        return dateCreation;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
