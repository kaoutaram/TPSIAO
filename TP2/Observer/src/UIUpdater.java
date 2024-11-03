class UIUpdater implements Observer {
    @Override
    public void update(int quantity) {
        System.out.println("Mise à jour de l'interface utilisateur: Stock de produit est maintenant " + quantity);
    }
}