import java.util.HashMap;
import java.util.Map;

public class Facture {
    private int id;
    private HashMap<Produit, Integer> produits;
    private static double TVA;

    public Facture(int id) {
        this.id = id;
        this.produits = new HashMap<>();
    }

    public static double getTVA() {
        return TVA;
    }

    public static void setTVA(double TVA) {
        Facture.TVA = TVA;
    }

    public void addProduit(Produit produit, int quantite) {
        this.produits.put(produit, quantite);
    }

    public double getTotal() {
        double total = 0;
        for (Map.Entry<Produit, Integer> entry : this.produits.entrySet()) {
            total += entry.getKey().getPrix() * entry.getValue();
        }
        return total;
    }

    public double getTotalTTC() {
        return this.getTotal() * (1 + TVA);
    }

    public int getId() {
        return id;
    }

    public HashMap<Produit, Integer> getProduits() {
        return produits;
    }
}
