public class ValidationAgeRegionB implements ValidationAgeStrategy {
    public boolean peutBoireAlcool(int age) {
        return age >= 19;
    }

    public boolean peutUtiliserFesseBouk(int age) {
        return age >= 14;
    }

    public boolean peutEtreEluMaire(int age) {
        return age >= 19;
    }
}