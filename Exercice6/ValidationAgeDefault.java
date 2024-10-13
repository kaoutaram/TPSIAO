
public class ValidationAgeDefault implements ValidationAgeStrategy {
    public boolean peutBoireAlcool(int age) {
        return age >= 18;
    }

    public boolean peutUtiliserFesseBouk(int age) {
        return age >= 13;
    }

    public boolean peutEtreEluMaire(int age) {
        return age >= 21;
    }
}


