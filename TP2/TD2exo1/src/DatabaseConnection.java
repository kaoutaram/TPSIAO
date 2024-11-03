import java.time.Duration;
import java.time.Instant;

class DatabaseConnection {
    // Instance unique de DatabaseConnection
    private static DatabaseConnection instance;
    private static Instant creationTime;

    // Constructeur privé pour empêcher la création d'instances
    private DatabaseConnection() {
        // Simule une connexion à la base de données avec un délai
        creationTime = Instant.now();
        System.out.println("Connexion à la base de données établie.");
    }

    // Méthode pour obtenir l'instance unique (Singleton)
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        } else {
            System.out.println("Connexion existante réutilisée.");
        }
        return instance;
    }

    // Méthode pour simuler l'exécution de requêtes SQL simples
    public void executeQuery(String query) {
        System.out.println("Exécution de la requête : " + query);
    }

    // Méthode pour obtenir le temps de création de la connexion
    public Duration getCreationDuration() {
        return Duration.between(creationTime, Instant.now());
    }
}



