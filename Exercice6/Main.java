public class Main {
    public static void main(String[] args) {
        ValidationAge validationAge = new ValidationAge();

        // Tester pour différentes régions
        System.out.println(validationAge.peutBoireAlcool(17, "RegionA"));
        System.out.println(validationAge.peutBoireAlcool(17, "RegionB"));
        System.out.println(validationAge.peutBoireAlcool(17, "Default"));
        System.out.println(validationAge.peutBoireAlcool(19, "RegionB"));



        //solution pour respecter ocp
        ValidationAgeContext contextA = new ValidationAgeContext(new ValidationAgeRegionA());
        ValidationAgeContext contextB = new ValidationAgeContext(new ValidationAgeRegionB());

        System.out.println(contextA.peutBoireAlcool(17)); // false (RegionA)
        System.out.println(contextB.peutBoireAlcool(19));
    }
}
