package org.example.postmanEcho;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTests {
    @Test
    void shouldReturnSendData() {

        given()
                .baseUri("https://postman-echo.com")
                .body("21.11.1992")
                .when()
                .post("/post")
                .then().log().all()
                .statusCode(200)
                .body("data", equalTo("21.11.1992"));
    }
}
