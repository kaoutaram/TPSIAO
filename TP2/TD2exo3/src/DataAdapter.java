import java.util.HashMap;
import java.util.Map;

class DataAdapter {
    private InternalData internalData;

    public DataAdapter(InternalData internalData) {
        this.internalData = internalData;
    }

    public Map<String, String> convertToExternalFormat() {
        Map<String, String> externalData = new HashMap<>();
        externalData.put("name", internalData.getFullName());
        externalData.put("email", internalData.getEmailAddress());
        externalData.put("phone", internalData.getPhoneNumber());
        return externalData;
    }

}
