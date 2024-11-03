import java.util.Map;

public class AdapterPatternExample {
    public static void main(String[] args) {
        // Crée une instance de InternalData avec des données internes
        InternalData internalData = new InternalData("John Doe", "john.doe@example.com", "123-456-7890");

        // Convertit les données avec DataAdapter
        DataAdapter adapter = new DataAdapter(internalData);
        Map<String, String> externalFormatData = adapter.convertToExternalFormat();

        // Envoie les données converties à l'API externe
        ExternalAPI api = new ExternalAPI();
        api.sendData(externalFormatData);
    }
}
