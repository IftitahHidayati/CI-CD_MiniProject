package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetAllOrders {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the GET api endpoints all orders")
    public String iSetGETApiEndpointsAllOrders(){
        return url + "orders";
    }
    @Step("I send HTTP GET request")
    public void iSendGETHTTPRequest(){
        SerenityRest.given().get(iSetGETApiEndpointsAllOrders());
    }
    @Step("I receive valids HTTP response code 200")
    public void iReceiveValidHTTPResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for all orders")
    public void iReceiveValidDataForAllOrders(){
    }
}
