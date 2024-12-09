package provider.products;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class DataRequest {
    public Map<String, String> getAddItem() {
        Map<String, String> dataCollection = new HashMap<>();
        String data1 = generateObjectPayload("Product 1");
        String data2 = generateObjectPayload("Product 2");
        dataCollection.put("addItem", data1);
        dataCollection.put("addItem2", data2);
        return dataCollection;
    }

    public Map<String, String> getUpdateItem() {
        Map<String, String> dataCollection = new HashMap<>();
        String data1 = generateObjectPayload("Product 1 Updated");
        String data2 = generateObjectPayload("Product 2 Updated");
        dataCollection.put("updateItem", data1);
        dataCollection.put("updateItem2", data2);
        return dataCollection;
    }

    private String generateObjectPayload (String title) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("title", title);
        return jsonObject.toString();
    }
}
