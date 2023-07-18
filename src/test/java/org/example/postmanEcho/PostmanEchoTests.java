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
                .then()
                .statusCode(200)
                .body("Data", equalTo("21.11.1992"));
    }
}
