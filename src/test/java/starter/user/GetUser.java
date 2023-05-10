package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetUser {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the GET api endpoints user information")
    public String iSetGETApiEndpointsUserInformation(){
        return url + "auth/info";
    }
    @Step("I send HTTP GET request post user")
    public void iSendGETHTTPRequest(){
        SerenityRest.given().get(iSetGETApiEndpointsUserInformation());
    }
    @Step("I receive valids HTTP response code 200")
    public void iReceiveValidHTTPResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for user information")
    public void iReceiveValidDataForUserInformation(){
        restAssuredThat(response -> response.body("data[0].ID", equalTo(14482)));
    }
}
