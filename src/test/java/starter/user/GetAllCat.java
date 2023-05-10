package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetAllCat {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the GET api endpoints all categories")
    public String iSetGETApiEndpointsAllCategories(){
        return url + "categories";
    }
    @Step("I send HTTP GET request")
    public void iSendGETHTTPRequest(){
        SerenityRest.given().get(iSetGETApiEndpointsAllCategories());
    }
    @Step("I receive valids HTTP response code 200")
    public void iReceiveValidHTTPResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for all categories")
    public void iReceiveValidDataForAllCategories(){
        restAssuredThat(response -> response.body("data[0].ID", equalTo(14482)));
    }
}
