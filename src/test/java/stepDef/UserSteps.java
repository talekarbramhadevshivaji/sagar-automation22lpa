package stepDef;

import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UserSteps {

	// private RequestSpecification request;
	private Response response;

	@Given("the base API endpint is set")
	public void the_base_api_endpint_is_set() {

		RestAssured.baseURI = "https://reqres.in/api/users";

	}

	@When("A GET request send to the endpoint {string}")
	public void a_get_request_send_to_the_endpoint(String string) {

		response = RestAssured.given().when().get("?page=2");

	}

	@Then("status code shoild be {int}")
	public void status_code_shoild_be(Integer int1) {

		Assert.assertEquals(int1.intValue(), response.getStatusCode());

	}

	@Then("the resonse should contains list of user")
	public void the_resonse_should_contains_list_of_user() {

		response.then().log().all();
	}

	@Then("validate the json response")
	public void validate_the_json_response() {

		response.then().body("data[0].email", equalTo("michael.lawson@reqres.in"))
				.body("data[0].first_name", equalTo("Michael")).body("data[0].last_name", equalTo("Lawson"));
	}

}
