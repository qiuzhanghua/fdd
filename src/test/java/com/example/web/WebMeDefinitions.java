package com.example.web;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebMeDefinitions {
    private String name;
    @When("the client calls \\/me")
    public void the_client_calls_me() {
//        OkHttpClient client = new OkHttpClient();
        OkHttpClient client = new OkHttpClient.Builder().build();
        Request request = new Request.Builder().url("http://localhost:8080/me").build();
        try (Response response = client.newCall(request).execute()) {
            name = response.body().string();
        } catch (Exception e) {
            name = null;
        }
    }
    @Then("the client receives status code of {int}")
    public void the_client_receives_status_code_of(Integer int1) {
    }
    @Then("the client receives server name Daniel")
    public void the_client_receives_server_name_daniel() {
        assertEquals(name, "Daniel");
    }
}
