package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetIndex {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the GET api endpoints index")
    public String iSetGETApiEndpointsIndex(){
        return url + "hello";
    }
    @Step("I send HTTP GET request")
    public void iSendGETHTTPRequest(){
        SerenityRest.given().get(iSetGETApiEndpointsIndex());
    }
    @Step("I receive valids HTTP response code 200")
    public void iReceiveValidHTTPResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for index")
    public void iReceiveValidDataForIndex(){
        restAssuredThat(response -> response.body("data[0].ID", equalTo(14482)));
    }
}
