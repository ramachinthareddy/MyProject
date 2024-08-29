package src.Java8Tasks;
import io.restassured.RestAssured;


public class Task28 {


    public class ResponsePrinter {

        public static void main(String[] args) {
            Response response = RestAssured.get("your_api_endpoint");

            if (response.getStatusCode() == 400 && response.getContentType().equalsIgnoreCase("application/json")) {
                System.out.println("Response Body: " + response.getBody().asString());
            }
        }
    }
}
