package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DelProduct {
    protected String url = "https://altashop-api.fly.dev/api/";
    @Step("I set DELETE api endpoints product")
    public String iSetDELETEApiEndpointsProduct(){
        return url + "products/1";
    }
    @Step("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest(){
        SerenityRest.given().delete(iSetDELETEApiEndpointsProduct());
    }
    @Step("I receive valid HTTP response code 200")
    public void iReceiveValidHTTPResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
