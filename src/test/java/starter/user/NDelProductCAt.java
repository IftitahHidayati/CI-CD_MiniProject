package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class NDelProductCAt {
    protected String url = "https://altashop-api.fly.dev/api/";
    @Step("I set unmatched DELETE api endpoints products categories")
    public String iSetUnmatchedDELETEApiEndpointsProductCategories(){
        return url + "cat/127587582858785729";
    }
    @Step("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest(){
        SerenityRest.given().delete(iSetUnmatchedDELETEApiEndpointsProductCategories());
    }
    @Step("I receive valid HTTP response code 404")
    public void iReceiveValidHTTPResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
