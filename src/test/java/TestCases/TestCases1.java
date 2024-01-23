package TestCases;


import Constant.ApiGlobalConstants;
import Constant.ApiURLs;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;

public class TestCases1 {

    @Test
    public void status() {

        //Request
        RequestSpecification request = given()
                .basePath(ApiURLs.baseUrl)
                .contentType("multipart/form-data");

        //Response
        Response response = request.when()
                .log().all()
                .get(ApiURLs.status);


        //Validations
        response.then()
                .log().all()
                .assertThat().statusCode(200)
                .assertThat().body("status", Matchers.equalTo("OK"))
                .time(Matchers.lessThan(ApiGlobalConstants.RESPONSE_TIME));
        System.out.println("EndPoint Time :  " + response.getTimeIn(TimeUnit.MILLISECONDS) + " mS");
    }

    @Test
    public void books() {

        //Request
        RequestSpecification request = given()
                .basePath(ApiURLs.baseUrl)
                .contentType("multipart/form-data");

        //Response
        Response response = request.when()
                .log().all()
                .get(ApiURLs.books);


        //Validations
        response.then()
                .log().all()
                .assertThat().statusCode(200)
                .time(Matchers.lessThan(ApiGlobalConstants.RESPONSE_TIME));
        System.out.println("EndPoint Time :  " + response.getTimeIn(TimeUnit.MILLISECONDS) + " mS");
    }

    @Test
    public void bookById() {
        String bookId = "1"; // Replace with the ID of the book you want to retrieve

        //Request
        RequestSpecification request = given()
                .basePath(ApiURLs.baseUrl)
                .contentType("multipart/form-data");

        //Response
        Response response = request.when()
                .pathParam("bookId", bookId)
                .log().all()
                .get(ApiURLs.books+"/{bookId}");


        //Validations
        response.then()
                .log().all()
                .assertThat().statusCode(200)
                .assertThat().body("status", Matchers.equalTo("OK"))
                .time(Matchers.lessThan(ApiGlobalConstants.RESPONSE_TIME));
        System.out.println("EndPoint Time :  " + response.getTimeIn(TimeUnit.MILLISECONDS) + " mS");
    }


    @Test
    public void createOrder() {
        String bookId = "1";
        String customerName = "John";

        //Request
        RequestSpecification request = given()
                .basePath(ApiURLs.baseUrl)
                .header("Authorization", "Bearer YOUR_ACCESS_TOKEN") // Replace with your actual access token
                .body("{\n" +
                        "  \"bookId\": " + bookId + ",\n" +
                        "  \"customerName\": \"" + customerName + "\"\n" +
                        "}")
                .contentType("multipart/form-data");

        //Response
        Response response = request.when()
                .log().all()
                .get(ApiURLs.orders);


        //Validations
        response.then()
                .log().all()
                .assertThat().statusCode(200)
                .assertThat().body("status", Matchers.equalTo("OK"))
                .time(Matchers.lessThan(ApiGlobalConstants.RESPONSE_TIME));
        System.out.println("EndPoint Time :  " + response.getTimeIn(TimeUnit.MILLISECONDS) + " mS");
    }
}
