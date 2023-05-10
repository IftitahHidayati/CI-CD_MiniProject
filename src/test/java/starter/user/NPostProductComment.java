package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class NPostProductComment {
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
    @Step("I set unmatched POST api endpoints comment")
    public String iSetUnmatchedPOSTApiEndpointsComment(){
        return url + "products/2/comments";
    }
    @Step("I send POST HTTP request post comment")
    public void iSendPOSTHTTPRequestPostComment(){
        String body = "{\n" +
                "    \"content\":\"the games are great including Gran Turismo 7 but sadly GT4 is much better\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetUnmatchedPOSTApiEndpointsComment());
    }
    @Step("I receive valid HTTP response code 404")
    public void iReceive1ValidHTTPResponseCode(){
        SerenityRest.given().header("Authorization", "Bearer " + token).get(iSetUnmatchedPOSTApiEndpointsComment());
        restAssuredThat(response -> response.statusCode(404));
    }
}
