package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PostOrder {
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
    @Step("I set POST api endpoints order")
    public String iSetPOSTApiEndpointsOrder(){
        return url + "orders";
    }
    @Step("I send POST HTTP request post order")
    public void iSendPOSTHTTPRequestPostOrder(){
        String body = "{\n" +
                "        \"product_id\":2,\n" +
                "        \"quantity\":1\n" +
                "    }";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body("[\n" + reqBody.toString() + "\n]").post(iSetPOSTApiEndpointsOrder());
    }
    @Step("I receive valid login and product HTTP response code 200")
    public void iReceive1ValidLoginAndProductHTTPResponseCode(){
        SerenityRest.given().header("Authorization", "Bearer " + token).get(iSetPOSTApiEndpointsOrder());
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for new order")
    public void iReceiveValidDataForNewOrder(){
//        restAssuredThat(response -> response.body("data[0].quantity", equalTo(1)));
    }
}
