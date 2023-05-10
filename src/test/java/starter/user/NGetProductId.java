package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class NGetProductId {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set unmatched GET api endpoints by Id")
    public String iSetUnmatchedGETApiEndpointsById(){
        return url + "pro/1";
    }
    @Step("I send HTTP GET request")
    public void iSendGETHTTPRequest(){
        SerenityRest.given().get(iSetUnmatchedGETApiEndpointsById());
    }
    @Step("I receive valids HTTP response code 404")
    public void iReceiveValidHTTPResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
