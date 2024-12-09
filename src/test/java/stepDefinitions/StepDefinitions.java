package stepDefinitions;

import java.util.Map;

import org.json.JSONObject;
import org.testng.Assert;

import api.products.Assertion;
import api.products.Endpoints;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.products.request.AddItem;
import model.products.request.UpdateItem;
import model.products.response.ResponseItem;
import provider.products.DataRequest;

public class StepDefinitions {
    RequestSpecification requestSpecification;
    private String BASE_URL = "https://dummyjson.com/products/";
    private int idObject;
    private Endpoints endpoints;
    private Assertion assertion;
    private DataRequest dataRequest;
    private String json;

    @Before
    public void setup() {
        endpoints = new Endpoints();
    }

    @Given("A list of products")
    public void a_list_of_products() {
        Response response = endpoints.getAllProducts();
        int statusCode = response.getStatusCode();
        System.out.println("Status code: " + statusCode);
        System.out.println("Response List Products: " + response.asPrettyString());
    }

    @When("I add a new product to the store {string}")
    public void i_add_a_new_product_to_the_store(String string) {
    dataRequest = new DataRequest();

        for(Map.Entry<String, String> entry : dataRequest.getAddItem().entrySet()) {
           if(entry.getKey().equals(string)) {
                json = entry.getValue();
                break;
           }
        }

        AddItem requestBody = new AddItem();
        requestBody.title = json;

        Response response = endpoints.addProduct(requestBody);
        System.out.println("Response Add Products: " + response.asPrettyString());

        idObject = response.jsonPath().getInt("id");

        ResponseItem validationData = new ResponseItem();

        for(Map.Entry<String, String> entry : dataRequest.getAddItem().entrySet()) {
            if(entry.getKey().equals(string)) {
                validationData.id = idObject;
                validationData.title = entry.getValue();
                break;
            }
        }

        System.out.println("validationData Add" + validationData);

        assertion = new Assertion();
        assertion.assertAddOrUpdateItem(response, validationData);

        // AddItem requestBody = new AddItem();
        // requestBody.title = "Product 1";

        // Response response = endpoints.addProduct(requestBody);
        // System.out.println("Response Add Products: " + response.asPrettyString());

        // idObject = response.jsonPath().getInt("id");

        // ResponseItem validationData = new ResponseItem();
        // validationData.id = idObject;
        // validationData.title = "Product 1";

        // assertion = new Assertion();
        // assertion.assertAddOrUpdateItem(response, validationData);

    }

    @Then("I should see the product added to the store")
    public void i_should_see_the_product_added_to_the_store() {
        RestAssured.baseURI = BASE_URL + idObject;
        requestSpecification = RestAssured.given();
        Response response = requestSpecification.get();
        System.out.println("Response Object By Id: " + response.asPrettyString());
    }

    @Then("I can update the product details {string}")
    public void i_can_update_the_product_details(String string) {
        dataRequest = new DataRequest();

        System.out.println("dataUpdateFromDatresquest" + string);

        for(Map.Entry<String, String> entry : dataRequest.getUpdateItem().entrySet()) {
            System.out.println("entry.getKey()" + entry.getKey());
            if(entry.getKey().equals(string)) {
                System.out.println("entry.getValue()" + entry.getValue());
                json = entry.getValue();
                break;
            }
        }

        // UpdateItem requestBody = new UpdateItem();
        // requestBody.title = json;

        System.out.println("JSONNN" + json);

        Response response = endpoints.updateProduct(json, 1);
        System.out.println("Response Update Products: " + response.asPrettyString());

        ResponseItem validationData = new ResponseItem();

        for(Map.Entry<String, String> entry : dataRequest.getUpdateItem().entrySet()) {
            if(entry.getKey().equals(string)) {
                System.out.println("entry.getValue() updated" + entry.getValue());
                validationData.id = 1;
                JSONObject title = new JSONObject(entry.getValue());
                validationData.title = title.getString("title");
                break;
            }
        }

        assertion = new Assertion();
        assertion.assertAddOrUpdateItem(response, validationData);
    }

    @Then("I can delete the product")
    public void i_can_delete_the_product() {

        Response response = endpoints.deleteProduct(1);
        System.out.println("Response Delete Products: " + response.asPrettyString());

        JSONObject responseData = new JSONObject(response.asString());

        Assert.assertEquals(responseData.getBoolean("isDeleted"), true);
    }



}