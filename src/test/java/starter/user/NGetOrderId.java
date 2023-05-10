package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class NGetOrderId {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the GET api endpoints oder Id")
    public String iSetUnmatchedGETApiEndpointsOrderId(){
        return url + "order/11111111";
    }
    @Step("I send HTTP GET request")
    public void iSendGETHTTPRequest(){
        SerenityRest.given().get(iSetUnmatchedGETApiEndpointsOrderId());
    }
    @Step("I receive valids HTTP response code 404")
    public void iReceiveValidHTTPResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
