package pactproject;

import au.com.dius.pact.consumer.dsl.DslPart;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.core.model.RequestResponsePact;
import au.com.dius.pact.core.model.annotations.Pact;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

@ExtendWith(PactConsumerTestExt.class)
public class ConsumerTest {

    // Create Map for the headers
    Map<String, String> headers = new HashMap<String, String>();
    // Set resource URI
    String createUser = "/api/users";

    // Create Pact contract
    @Pact(provider = "UserProvider", consumer = "UserConsumer")
    public RequestResponsePact createPact(PactDslWithProvider builder) throws ParseException {

        headers.put("Content-Type", "application/json");
        // Create request JSON
        DslPart requestResponceBody = new PactDslJsonBody()
                .numberType("id", 1)
                .stringType("firstName", "Krishna")
                .stringType("lastName", "Peddisetti")
                .stringType("email", "krishnap@gmail.com");

        // Create rules for request and response
        return builder.given("Post Request")
                .uponReceiving("A request to create a user")
                .method("POST")
                .path(createUser)
                .headers(headers)
                .body(requestResponceBody)
                .willRespondWith()
                .status(201)
                .body(requestResponceBody)
                .toPact();

    }


    @Test
    @PactTestFor(providerName = "UserProvider", port = "8282")
    public void runTest() {
        // Mock url
        Map<String, Object> reqBody = new HashMap<String, Object>();
        reqBody.put("id", 1);
        reqBody.put("firstName", "Krishna");
        reqBody.put("lastName", "Peddisetti");
        reqBody.put("email", "krishnap@gmail.com");
        // Send POST request
        RestAssured.baseURI = "http://localhost:8282";
        RequestSpecification rq = RestAssured.given().headers(headers).when();
        // Send POST request
        Response response = rq.body(reqBody).post(createUser);
       // Assertion
       // assert (response.getStatusCode() == 201);


    }


}
