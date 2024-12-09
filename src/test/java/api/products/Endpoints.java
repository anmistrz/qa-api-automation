package api.products;

import org.json.JSONObject;

import com.apiautomation.Constants;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.products.request.AddItem;
import model.products.request.UpdateItem;

public class Endpoints {
    public static RequestSpecification requestSpecification;
    private static final String baseUrl = Constants.BASE_URL_PRODUCTS.getValue();

    public Endpoints() {
        RestAssured.baseURI = Constants.BASE_URL_PRODUCTS.getValue();
        requestSpecification = RestAssured.given();
        System.out.println("requestSpecification: " + requestSpecification);
    }

    public Response getAllProducts() {
        System.out.println("BASE_URL: " + baseUrl);
        Response response = requestSpecification.get();
        return response;
    }

    public Response getProductById(int id) {
        RestAssured.baseURI = baseUrl + id;
        requestSpecification = RestAssured.given();
        Response response = requestSpecification.get();
        return response;
    }

    public Response addProduct(AddItem reqBody) {
        RestAssured.baseURI = baseUrl + "add";
        requestSpecification = RestAssured.given();
        
        Response response = requestSpecification
                            .header("Content-Type", "application/json")
                            .body(reqBody)
                            .post();
        return response;
    }

    public Response updateProduct(String reqBody, int id) {
        RestAssured.baseURI = baseUrl + id;
        requestSpecification = RestAssured.given();
        System.out.println("reqBody Update: " + reqBody);

        Response response = requestSpecification
                            .header("Content-Type", "application/json")
                            .body(reqBody)
                            .put();
        return response;
    }

    public Response deleteProduct(int id) {
        RestAssured.baseURI = baseUrl + id;
        requestSpecification = RestAssured.given();
        Response response = requestSpecification.delete();
        return response;
    }

}
