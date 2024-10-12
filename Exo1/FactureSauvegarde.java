import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class FactureSauvegarde {
    public void sauvegarder(Facture facture, String fichier) {
        try {
            FileWriter writer = new FileWriter(fichier);
            writer.write("Facture ID: " + facture.getId() + "\n");
            double prix;
            for (Map.Entry<Produit, Integer> entry : facture.getProduits().entrySet()) {
                prix = entry.getKey().getPrix() * entry.getValue();
                writer.write(entry.getKey().getLibele() + "\t" + entry.getValue() + " : " + prix + "\n");
            }
            writer.write("Prix = " + facture.getTotal() + "\n");
            writer.write("PrixTTC = " + facture.getTotalTTC() + "\n");
            writer.close();

            System.out.println("Facture sauvegardée avec succès dans " + fichier);
        } catch (IOException e) {
            System.out.println("Une erreur s'est produite.");
            e.printStackTrace();
        }
    }
}
