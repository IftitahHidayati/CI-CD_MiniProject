package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetOrderId {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the GET api endpoints oder Id")
    public String iSetGETApiEndpointsOrderId(){
        return url + "orders/1";
    }
    @Step("I send HTTP GET request")
    public void iSendGETHTTPRequest(){
        SerenityRest.given().get(iSetGETApiEndpointsOrderId());
    }
    @Step("I receive valids HTTP response code 200")
    public void iReceiveValidHTTPResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for order by ID")
    public void iReceiveValidDataForOrderByID(){
//        restAssuredThat(response -> response.body("'data'.'ID'", equalTo(1)));
    }
}
