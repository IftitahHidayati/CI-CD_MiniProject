package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PostProduct {
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
    @Step("I set POST api endpoints product")
    public String iSetPOSTApiEndpointsProduct(){
        return url + "products";
    }
    @Step("I send POST HTTP request product")
    public void iSendPOSTHTTPRequestpostproduct(){
        String body = "{\n" +
                "    \"name\":\"Sony PS5\",\n" +
                "    \"description\":\"play has no limits\",\n" +
                "    \"price\":299,\n" +
                "    \"categories\":[\n" +
                "        1\n" +
                "    ]\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetPOSTApiEndpointsProduct());
    }
    @Step("I receive valid login and product HTTP response code 200")
    public void iReceive1ValidLoginAndProductHTTPResponseCode(){
        SerenityRest.given().header("Authorization", "Bearer " + token).get(iSetPOSTApiEndpointsProduct());
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for new product")
    public void iReceiveValidDataForNewProduct(){
//        restAssuredThat(response -> response.body("data[0].Name", equalTo("Sony PS5")));
    }
}
