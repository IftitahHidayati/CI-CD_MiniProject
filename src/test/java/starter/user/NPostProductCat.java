package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class NPostProductCat {
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
    @Step("I set POST api endpoints product category")
    public String iSetUnmatchedPOSTApiEndpointsProductCategory(){
        return url + "cat";
    }
    @Step("I send POST HTTP request post categories")
    public void iSendPOSTHTTPRequestPostCategories(){
        String body = "{\n" +
                "    \"name\":\"gaming\",\n" +
                "    \"description\":\"for gaming purposes\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetUnmatchedPOSTApiEndpointsProductCategory());
    }
    @Step("I receive valid login and product HTTP response code 404")
    public void iReceiveValidLoginAndProductHTTPResponseCode404(){
        SerenityRest.given().header("Authorization", "Bearer " + token).get(iSetUnmatchedPOSTApiEndpointsProductCategory());
        restAssuredThat(response -> response.statusCode(404));
    }
}
