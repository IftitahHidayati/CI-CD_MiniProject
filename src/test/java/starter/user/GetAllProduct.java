package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetAllProduct {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the GET api endpoints")
    public String iSetGETApiEndpoints(){
        return url + "products";
    }
    @Step("I send HTTP GET request")
    public void iSendGETHTTPRequest(){
        SerenityRest.given().get(iSetGETApiEndpoints());
    }
    @Step("I receive valids HTTP response code 200")
    public void iReceiveValidHTTPResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for all products")
    public void iReceiveValidDataForAllProducts(){
        restAssuredThat(response -> response.body("data[0].Name", equalTo("description")));
    }
}
