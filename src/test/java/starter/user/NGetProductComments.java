package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class NGetProductComments {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set unmatched GET api endpoints product comments")
    public String iSetUnmatchedGETApiEndpointsProductComments(){
        return url + "products/2/comment";
    }
    @Step("I send HTTP GET request")
    public void iSendGETHTTPRequest(){
        SerenityRest.given().get(iSetUnmatchedGETApiEndpointsProductComments());
    }
    @Step("I receive valids HTTP response code 404")
    public void iReceiveValidHTTPResponseCode(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
