//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DocumentFactory factory = new DocumentFactory();

        // Création de documents
        Document report1 = factory.createDocument("report", "Annual Report", "Alice", "This is the annual report content.");

        Document invoice1 = factory.createDocument("invoice", "Invoice #123", "Charlie", 1500.00);

        // Affichage des documents originaux
        System.out.println("Original Documents:");
        System.out.println(report1);

        System.out.println(invoice1);

        // Clonage des documents
        Document report2 = report1.clone();


        // Affichage des documents clonés
        System.out.println("\nCloned Documents:");
        System.out.println(report2);


        // Modifications sur le document original
        // (Note: pour tester le clonage, vous pouvez changer le contenu du document original et vérifier que le clone reste inchangé)
        // report1.content = "Updated content"; // Cela n'affectera pas report2
 
        // Vérification des clones
        System.out.println("\nAfter modification:");
        System.out.println(report1);
        System.out.println(report2);
    }
    }

