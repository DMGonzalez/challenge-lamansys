package pageMethods;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class RequestMethods {
    public static Response response;
    public static String testType;
    public static void apiRequest() {
        RestAssured.baseURI = CommonsMethods.props.urlApi();
        response =
                given()
                        .header("Content-Type", "application/json")
                        .when()
                        .get(CommonsMethods.props.pathApi())
                        .then()
                        .extract()
                        .response();
        testType = "api_test";
    }

    public static void checkStatusAndQuantity() {
        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals(28, response.getHeaders().size());
    }
}
