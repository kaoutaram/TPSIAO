import java.util.Map;

public class FactureImprimeur {
    public void imprimer(Facture facture) {
        System.out.println("Facture ID: " + facture.getId());
        double prix;
        for (Map.Entry<Produit, Integer> entry : facture.getProduits().entrySet()) {
            prix = entry.getKey().getPrix() * entry.getValue();
            System.out.println(entry.getKey().getLibele() + "\t" + entry.getValue() + " : " + prix);
        }
        System.out.println("Prix = " + facture.getTotal());
        System.out.println("PrixTTC = " + facture.getTotalTTC());
    }
}
