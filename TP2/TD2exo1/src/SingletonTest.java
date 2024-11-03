public class SingletonTest {
    public static void main(String[] args) {
        // Première tentative de connexion
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        System.out.println("Temps de création de la première connexion : " + db1.getCreationDuration().toMillis() + " ms");

        // Exécution d'une requête sur la première connexion
        db1.executeQuery("SELECT * FROM utilisateurs");

        // Deuxième tentative de connexion
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        System.out.println("Temps de création de la deuxième connexion : " + db2.getCreationDuration().toMillis() + " ms");

        // Exécution d'une requête sur la deuxième connexion
        db2.executeQuery("INSERT INTO utilisateurs (nom, age) VALUES ('Alice', 30)");

        // Vérification que les deux objets db1 et db2 sont identiques
        System.out.println("db1 et db2 sont la même instance : " + (db1 == db2));
    }}