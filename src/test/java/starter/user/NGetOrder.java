package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class NGetOrder {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the GET api endpoints all orders")
    public String iSetUnmatchedGETApiEndpointsAllOrders(){
        return url + "ord";
    }
    @Step("I send HTTP GET request")
    public void iSendGETHTTPRequest(){
        SerenityRest.given().get(iSetUnmatchedGETApiEndpointsAllOrders());
    }
    @Step("I receive valids HTTP response code 404")
    public void iReceiveValidHTTPResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
