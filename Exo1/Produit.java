public class Produit {
    private String libele;
    private double prix;

    public Produit(String libele, double prix) {
        this.libele = libele;
        this.prix = prix;
    }

    public String getLibele() {
        return libele;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "libele='" + libele + '\'' +
                ", prix=" + prix +
                '}';
    }
}
