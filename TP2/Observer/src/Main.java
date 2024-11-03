//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stock product = new Stock("Produit A", 10);

        // Création des observateurs

        UIUpdater uiUpdater = new UIUpdater();


        // Enregistrement des observateurs

        product.addObserver(uiUpdater);


        // Changement de la quantité
        product.setQuantity(3);  // Devrait déclencher l'email et les mises à jour UI
        product.setQuantity(7);  // Devrait mettre à jour l'UI et le rapport
        product.setQuantity(2);  // Devrait déclencher l'email à nouveau
    }
    }
