package src.Java8Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Task27 {
    public static void main(String[] args) {
        // Create a list of responses
        List<Response> responses = new ArrayList<>();
        responses.add(new Response("JSON", "{ \"message\": \"Hello, World!\" }"));
        responses.add(new Response("XML", "<message>Hello, World!</message>"));
        responses.add(new Response("JSON", "{ \"message\": \"Goodbye!\" }"));
        responses.add(new Response("JSON", "{ \"message\": \"Welcome!\" }"));

        // Define the predicate to check if the response type is JSON
        Predicate<Response> isJsonResponse = response -> response.getResponseType().equals("JSON");

        // Print all the responses with JSON type
        for (Response response : responses) {
            if (isJsonResponse.test(response)) {
                System.out.println(response.getResponse());
            }
        }
    }
    static class Response {
        private String responseType;
        private String response;

        public Response(String responseType, String response) {
            this.responseType = responseType;
            this.response = response;
        }

        public String getResponseType() {
            return responseType;
        }

        public String getResponse() {
            return response;
        }
    }

}
