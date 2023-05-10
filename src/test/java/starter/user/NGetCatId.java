package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class NGetCatId {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set unmatched the GET api endpoints category Id")
    public String iSetUnmatchedGETApiEndpointsCategoryId(){
        return url + "cat/11304";
    }
    @Step("I send HTTP GET request")
    public void iSendGETHTTPRequest(){
        SerenityRest.given().get(iSetUnmatchedGETApiEndpointsCategoryId());
    }
    @Step("I receive valid HTTP response code 404")
    public void iReceiveValidHTTPResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
