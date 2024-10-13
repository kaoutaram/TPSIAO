public class ValidationAgeRegionA implements ValidationAgeStrategy {
    public boolean peutBoireAlcool(int age) {
        return age >= 14;
    }

    public boolean peutUtiliserFesseBouk(int age) {
        return age >= 15;
    }

    public boolean peutEtreEluMaire(int age) {
        return age >= 21;
    }
}