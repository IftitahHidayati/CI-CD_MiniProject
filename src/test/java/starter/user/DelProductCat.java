package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DelProductCat {
    protected String url = "https://altashop-api.fly.dev/api/";
    @Step("I set DELETE api endpoints products categories")
    public String iSetDELETEApiEndpointsProductCategories(){
        return url + "categories/1";
    }
    @Step("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest(){
        SerenityRest.given().delete(iSetDELETEApiEndpointsProductCategories());
    }
    @Step("I receive valid HTTP response code 200")
    public void iReceiveValidHTTPResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
