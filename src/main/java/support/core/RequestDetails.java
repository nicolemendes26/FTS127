package support.core;

import io.restassured.RestAssured;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.RequestSpecification;

public class RequestDetails {
    // Endereço do Serviço
    public static String uri = "https://petstore.swagger.io/v2";

    public static RequestSpecification getRequestSpecification() {

        RequestSpecification requestSpecification = RestAssured.given().baseUri(uri)
                .contentType("application/json")
                .header("Connection", "keep-alive");

        return requestSpecification;
    }
}

