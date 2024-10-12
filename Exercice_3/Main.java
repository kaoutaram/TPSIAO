public class Main {
    public static void main(String[] args) {
        MatriceYoung tableau = new MatriceYoung(3, 3); // Créer un tableau de Young de 3x3

        // Ajouter des éléments
        tableau.add(5);
        tableau.add(3);
        tableau.add(8);
        tableau.add(1);
        tableau.add(7);
        tableau.add(6);
        tableau.add(4);
        tableau.add(2);
        tableau.add(9);

        // Afficher le tableau après insertion
        System.out.println("Tableau de Young après insertion :");
        tableau.printTableau();

        // Extraire le minimum
        int min = tableau.extraireMin();
        System.out.println("Min extrait : " + (min == MatriceYoung.INF ? "INF" : min));

        // Afficher le tableau après extraction
        System.out.println("Tableau de Young après extraction :");
        tableau.printTableau();
    }
}