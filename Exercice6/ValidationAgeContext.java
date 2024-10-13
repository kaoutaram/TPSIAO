public class ValidationAgeContext {
    private ValidationAgeStrategy strategy;

    public ValidationAgeContext(ValidationAgeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean peutBoireAlcool(int age) {
        return strategy.peutBoireAlcool(age);
    }

    public boolean peutUtiliserFesseBouk(int age) {
        return strategy.peutUtiliserFesseBouk(age);
    }

    public boolean peutEtreEluMaire(int age) {
        return strategy.peutEtreEluMaire(age);
    }
}