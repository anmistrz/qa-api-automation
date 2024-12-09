package api.products;

import org.json.JSONObject;
import org.testng.Assert;

import io.restassured.response.Response;
import model.products.response.ResponseItem;

public class Assertion {
    public void assertAddOrUpdateItem(Response response, ResponseItem responseItem) {
        System.out.println("responseeee" + response);
        JSONObject responseData = new JSONObject(response.asString());
        System.out.println("responseeeData" + responseData);
        System.out.println("responseItem" + responseItem);
        Assert.assertEquals(responseData.getString("title"), responseItem.title);
        Assert.assertEquals(responseData.getInt("id"), responseItem.id);
    }
}