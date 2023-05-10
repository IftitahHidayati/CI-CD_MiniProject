package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class NGetAllProduct {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the GET api endpoints")
    public String iSetUnmatchedGETApiEndpoints(){
        return url + "pro";
    }
    @Step("I send HTTP GET request")
    public void iSendGETHTTPRequest(){
        SerenityRest.given().get(iSetUnmatchedGETApiEndpoints());
    }
    @Step("I receive valids HTTP response code 404")
    public void iReceiveValidHTTPResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
