package Java8Tasks;

import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Response {
    private int statusCode;
    private String body;

    public Response(int statusCode, String body) {
        this.statusCode = statusCode;
        this.body = body;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Response{" +
                "statusCode=" + statusCode +
                ", body='" + body + '\'' +
                '}';
    }
}

public class Task26  {
    public static void main(String[] args) {
        List<Response> responses = new ArrayList<>();
        responses.add(new Response(200, "OK"));
        responses.add(new Response(400, "Bad Request"));
        responses.add(new Response(404, "Not Found"));
        responses.add(new Response(400, "Invalid Input"));
        responses.add(new Response(500, "Internal Server Error"));

        Predicate<Response> statusCode400Predicate = response -> response.getStatusCode() == 400;

        List<Response> statusCode400Responses = responses.stream()
                .filter(statusCode400Predicate)
                .collect(Collectors.toList());

        statusCode400Responses.forEach(response -> System.out.println(response));
    }
}