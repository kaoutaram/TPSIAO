public class ValidationAge {
    public boolean peutBoireAlcool(int age, String region) {
        switch (region) {
            case "RegionA": // exemple: région où l'âge minimum est 14
                return age >= 14;
            case "RegionB": // exemple: région où l'âge minimum est 19
                return age >= 19;
            default: // région par défaut
                return age >= 18;
        }
    }

    public boolean peutUtiliserFesseBouk(int age, String region) {
        switch (region) {
            case "RegionA": // exemple: région où l'âge minimum est 15
                return age >= 15;
            case "RegionB": // exemple: région où l'âge minimum est 14
                return age >= 14;
            default: // région par défaut
                return age >= 13;
        }
    }

    public boolean peutEtreEluMaire(int age, String region) {
        switch (region) {
            case "RegionA": // exemple: région où l'âge minimum est 21
                return age >= 21;
            case "RegionB": // exemple: région où l'âge minimum est 19
                return age >= 19;
            default: // région par défaut
                return age >= 21;
        }
    }
}
