package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PostRegister {
    protected String url = "https://altashop-api.fly.dev/api/";
    public String token="";

    @Step("I set POST api endpoints login")
    public String iSetPOSTApiEndpointsLogin(){
        return url + "auth/login";
    }
    @Step("I send POST HTTP request login")
    public void iSendPOSTHTTPRequestLogin(){
        String body = "{\n" +
                "    \"email\":\"someone@mail.com\",\n" +
                "    \"password\":\"123123\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetPOSTApiEndpointsLogin());
        token = lastResponse().getBody().jsonPath().get("data");
    }
    @Step("I set POST api endpoints register")
    public String iSetPOSTApiEndpointsRegister(){
        return url + "auth/register";
    }
    @Step("I send POST HTTP request post register")
    public void iSendPOSTHTTPRequestPostRegister(){
        String body = "{\n" +
                "    \"email\":\"danang@mail.com\",\n" +
                "    \"password\":\"123123\",\n" +
                "    \"fullname\":\"Firstname Lastname\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetPOSTApiEndpointsRegister());
    }
    @Step("I receive valid login and product HTTP response code 200")
    public void iReceive1ValidHTTPResponseCode(){
        SerenityRest.given().header("Authorization", "Bearer " + token).get(iSetPOSTApiEndpointsRegister());
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for register")
    public void iReceiveValidDataForRegister(){
//        restAssuredThat(response -> response.body("data[0].ID", equalTo("12887")));
    }
}
