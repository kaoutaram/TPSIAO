public class Main {
    public static void main(String[] args) {
        // Créer quelques produits
        Produit produit1 = new Produit("Ordinateur", 750.99);
        Produit produit2 = new Produit("Clavier", 30.50);
        Produit produit3 = new Produit("Souris", 15.99);

        // Créer une facture
        Facture facture = new Facture(1);

        // Ajouter des produits à la facture
        facture.addProduit(produit1, 2);  // 2 ordinateurs
        facture.addProduit(produit2, 1);  // 1 clavier
        facture.addProduit(produit3, 3);  // 3 souris

        // Définir la TVA
        Facture.setTVA(0.20);  // 20% TVA

        // Créer une instance de FactureImprimeur et imprimer la facture
        FactureImprimeur imprimeur = new FactureImprimeur();
        imprimeur.imprimer(facture);

        // Créer une instance de FactureSauvegarde et sauvegarder la facture
        FactureSauvegarde sauvegarde = new FactureSauvegarde();
        sauvegarde.sauvegarder(facture, "facture.txt");
        // Affichage de la fin du programme
        System.out.println("Test terminé.");
    }
}
