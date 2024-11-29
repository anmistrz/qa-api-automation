package stepDefinitions;

import org.json.JSONObject;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepDefinitions {
    RequestSpecification requestSpecification;
    private String BASE_URL = "https://dummyjson.com/products/";
    private int idObject;

    @Before
    public void setup() {
        RestAssured.baseURI = BASE_URL;
        requestSpecification = RestAssured.given();
    }

    @Given("A list of products")
    public void a_list_of_products() {
        Response response = requestSpecification.get();
        int statusCode = response.getStatusCode();
        System.out.println("Status code: " + statusCode);
        System.out.println("Response List Products: " + response.asPrettyString());
    }

    @When("I add a new product to the store")
    public void i_add_a_new_product_to_the_store() {
        RestAssured.baseURI = BASE_URL + "add";
        requestSpecification = RestAssured.given();

        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Product 1");

        System.out.println("Request Body: " + requestBody.toString());
        Response response = requestSpecification
                            .header("Content-Type", "application/json")
                            .body(requestBody.toString())
                            .post();

        System.out.println("Id Object: " + idObject);
        System.out.println("Response Add Products: " + response.asPrettyString());

        idObject = response.jsonPath().getInt("id");

        JSONObject responseData = new JSONObject(response.asString());

        Assert.assertEquals(responseData.getString("title"), "Product 1");
        Assert.assertEquals(responseData.getInt("id"), idObject);

    }

    @Then("I should see the product added to the store")
    public void i_should_see_the_product_added_to_the_store() {
        RestAssured.baseURI = BASE_URL + idObject;
        requestSpecification = RestAssured.given();
        Response response = requestSpecification.get();
        System.out.println("Response Object By Id: " + response.asPrettyString());
    }



}