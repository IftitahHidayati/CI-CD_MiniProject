package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class NDelProduct {
    protected String url = "https://altashop-api.fly.dev/api/";
    @Step("I set unmatched DELETE api endpoints product")
    public String iSetUnmatchedDELETEApiEndpointsProduct(){
        return url + "product/157876865876689";
    }
    @Step("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest(){
        SerenityRest.given().delete(iSetUnmatchedDELETEApiEndpointsProduct());
    }
    @Step("I receive valid HTTP response code 500")
    public void iReceiveValidHTTPResponseCode500(){
        restAssuredThat(response -> response.statusCode(500));
    }
}
