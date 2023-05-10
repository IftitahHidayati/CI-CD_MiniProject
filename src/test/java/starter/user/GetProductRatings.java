package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetProductRatings {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the GET api endpoints product ratings")
    public String iSetGETApiEndpointsProductRatings(){
        return url + "products/1/ratings";
    }
    @Step("I send HTTP GET request")
    public void iSendGETHTTPRequest(){
        SerenityRest.given().get(iSetGETApiEndpointsProductRatings());
    }
    @Step("I receive valids HTTP response code 200")
    public void iReceiveValidHTTPResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for product ratings")
    public void iReceiveValidDataForProductRatings(){
        restAssuredThat(response -> response.body("data[0].Ratings", equalTo(4)));
    }
}
