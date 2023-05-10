package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.*;

public class UserSteps {
//    ============================Product============================
    @Steps
    GetAllProduct allProduct;
    @Given("I set GET api endpoints")
    public void iSetGETApiEndpoints() {
        allProduct.iSetGETApiEndpoints();
    }
    @When("I send GET HTTP request")
    public void iSendGETHTTPRequest() {
        allProduct.iSendGETHTTPRequest();
    }
    @Then("I receive valid HTTP response code 200")
    public void iReceiveValidHTTPResponseCode() {
        allProduct.iReceiveValidHTTPResponseCode();
    }
    @And("I receive valid data for all products")
    public void iReceiveValidDataForAllProducts() {
        allProduct.iReceiveValidDataForAllProducts();
    }

    @Steps
    NGetAllProduct nGetAllProduct;
    @Given("I set unmatched GET api endpoints")
    public void iSetUnmatchedGETApiEndpoints() {
        nGetAllProduct.iSetUnmatchedGETApiEndpoints();
    }

    @Then("I receive valid HTTP response code 404")
    public void iReceiveValidHTTPResponseCode404() {
        nGetAllProduct.iReceiveValidHTTPResponseCode404();
    }

    @Steps
    GetProductId productId;
    @Given("I set GET api endpoints by Id")
    public void iSetGETApiEndpointsById() {
        productId.iSetGETApiEndpointsById();
    }
    @And("I receive valid data for one detail product")
    public void iReceiveValidDataForOneDetailProduct() {
        productId.iReceiveValidDataForOneDetailProduct();
    }

    @Steps
    NGetProductId nGetProductId;
    @Given("I set unmatched GET api endpoints by Id")
    public void iSetUnmatchedGETApiEndpointsById() {
        nGetProductId.iSetUnmatchedGETApiEndpointsById();
    }

    @Steps
    GetProductRatings productRatings;
    @Given("I set GET api endpoints product ratings")
    public void iSetGETApiEndpointsProductRatings() {
        productRatings.iSetGETApiEndpointsProductRatings();
    }
    @And("I receive valid data for product ratings")
    public void iReceiveValidDataForProductRatings() {
        productRatings.iReceiveValidDataForProductRatings();
    }

    @Steps
    NGetProductRatings nGetProductRatings;
    @Given("I set unmatched GET api endpoints product ratings")
    public void iSetUnmatchedGETApiEndpointsProductRatings() {
        nGetProductRatings.iSetUnmatchedGETApiEndpointsProductRatings();
    }

    @Steps
    GetProductComments productComments;
    @Given("I set GET api endpoints product comments")
    public void iSetGETApiEndpointsProductComments() {
        productComments.iSetGETApiEndpointsProductComments();
    }
    @And("I receive valid data for product comments")
    public void iReceiveValidDataForProductComments() {
        productComments.iReceiveValidDataForProductComments();
    }

    @Steps
    NGetProductComments nGetProductComments;
    @Given("I set unmatched GET api endpoints product comments")
    public void iSetUnmatchedGETApiEndpointsProductComments() {
        nGetProductComments.iSetUnmatchedGETApiEndpointsProductComments();
    }

    @Steps
    DelProduct delProduct;
    @Given("I set DELETE api endpoints product")
    public void iSetDELETEApiEndpointsProduct() {
        delProduct.iSetDELETEApiEndpointsProduct();
    }

    @When("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest() {
        delProduct.iSendDELETEHTTPRequest();
    }

    @Steps
    NDelProduct nDelProduct;
    @Given("I set unmatched DELETE api endpoints product")
    public void iSetUnmatchedDELETEApiEndpointsProduct() {
        nDelProduct.iSetUnmatchedDELETEApiEndpointsProduct();
    }

    @Then("I receive valid HTTP response code 500")
    public void iReceiveValidHTTPResponseCode500(){
        nDelProduct.iReceiveValidHTTPResponseCode500();
    }

    @Steps
    PostProduct postProduct;
    @And("I set POST api endpoints product")
    public void iSetPOSTApiEndpointsProduct() {
        postProduct.iSetPOSTApiEndpointsProduct();
    }

    @And("I send POST HTTP request post product")
    public void iSendPOSTHTTPRequestpostproduct() {
        postProduct.iSendPOSTHTTPRequestpostproduct();
    }
    @Then("I receive valid login and product HTTP response code 200")
    public void iReceive1ValidLoginAndProductHTTPResponseCode() { postProduct.iReceive1ValidLoginAndProductHTTPResponseCode();
    }
    @And("I receive valid data for new product")
    public void iReceiveValidDataForNewProduct() {
        postProduct.iReceiveValidDataForNewProduct();
    }

    @Steps
    NPostProduct nPostProduct;
    @And("I set unmatched POST api endpoints product")
    public void iSetUnmatchedPOSTApiEndpointsProduct() {
        nPostProduct.iSetUnmatchedPOSTApiEndpointsProduct();
    }

    @Then("I receive valid login and product HTTP response code 404")
    public void iReceiveValidLoginAndProductHTTPResponseCode404() {
        nPostProduct.iReceiveValidLoginAndProductHTTPResponseCode404();
    }

    @Steps
    PostProductRating postProductRating;
    @And("I set POST api endpoints rating")
    public void iSetPOSTApiEndpointsRating() {
        postProductRating.iSetPOSTApiEndpointsRating();
    }

    @And("I send POST HTTP request post rating")
    public void iSendPOSTHTTPRequestPostRating() { postProductRating.iSendPOSTHTTPRequestPostRating();
    }
    @And("I receive valid data for rating")
    public void iReceiveValidDataForRating() {
        postProductRating.iReceiveValidDataForRating();
    }

    @Steps
    NPostProductRating nPostProductRating;
    @And("I set unmatched POST api endpoints rating")
    public void iSetUnmatchedPOSTApiEndpointsRating() {
        nPostProductRating.iSetUnmatchedPOSTApiEndpointsRating();
    }

    @Steps
    PostProductComment postProductComment;
    @And("I set POST api endpoints comment")
    public void iSetPOSTApiEndpointsComment() {
        postProductComment.iSetPOSTApiEndpointsComment();
    }

    @And("I send POST HTTP request post comment")
    public void iSendPOSTHTTPRequestPostComment() { postProductComment.iSendPOSTHTTPRequestPostComment();
    }
    @And("I receive valid data for comment")
    public void iReceiveValidDataForComment() {
        postProductComment.iReceiveValidDataForComment();
    }

    @Steps
    NPostProductComment nPostProductComment;
    @And("I set unmatched POST api endpoints comment")
    public void iSetUnmatchedPOSTApiEndpointsComment() {
        nPostProductComment.iSetUnmatchedPOSTApiEndpointsComment();
    }

    //    ============================Product Category============================
    @Steps
    GetCatId catId;
    @Given("I set GET api endpoints category Id")
    public void iSetGETApiEndpointsCategoryId() {
        catId.iSetGETApiEndpointsCategoryId();
    }
    @And("I receive valid data for category by ID")
    public void iReceiveValidDataForCategoryByID() {
        catId.iReceiveValidDataForCategoryByID();
    }

    @Steps
    NGetCatId nGetCatId;
    @Given("I set unmatched GET api endpoints category Id")
    public void iSetUnmatchedGETApiEndpointsCategoryId() {
        nGetCatId.iSetUnmatchedGETApiEndpointsCategoryId();
    }

    @Steps
    GetAllCat allCat;
    @Given("I set GET api endpoints all categories")
    public void iSetGETApiEndpointsAllCategories() {
        allCat.iSetGETApiEndpointsAllCategories();
    }
    @And("I receive valid data for all categories")
    public void iReceiveValidDataForAllCategories() {
        allCat.iReceiveValidDataForAllCategories();
    }

    @Steps
    NGetAllCat nGetAllCat;
    @Given("I set unmatched GET api endpoints all categories")
    public void iSetUnmatchedGETApiEndpointsAllCategories() {
        nGetAllCat.iSetUnmatchedGETApiEndpointsAllCategories();
    }

    @Steps
    DelProductCat delProductCat;
    @Given("I set DELETE api endpoints product categories")
    public void iSetDELETEApiEndpointsProductCategories() {
        delProductCat.iSetDELETEApiEndpointsProductCategories();
    }

    @Steps
    NDelProductCAt nDelProductCAt;
    @Given("I set unmatched DELETE api endpoints product categories")
    public void iSetUnmatchedDELETEApiEndpointsProductCategories() {
        nDelProductCAt.iSetUnmatchedDELETEApiEndpointsProductCategories();
    }

    @Steps
    PostProductCat postProductCat;
    @And("I set POST api endpoints product category")
    public void iSetPOSTApiEndpointsProductCategory() {
        postProductCat.iSetPOSTApiEndpointsProductCategory();
    }
    @And("I send POST HTTP request post categories")
    public void iSendPOSTHTTPRequestPostCategories() { postProductCat.iSendPOSTHTTPRequestPostCategories();
    }
    @And("I receive valid data for new product category")
    public void iReceiveValidDataForNewProductCategory() {
        postProductCat.iSetPOSTApiEndpointsProductCategory();
    }

    @Steps
    NPostProductCat nPostProductCat;
    @And("I set unmatched POST api endpoints product category")
    public void iSetUnmatchedPOSTApiEndpointsProductCategory() {
        nPostProductCat.iSetUnmatchedPOSTApiEndpointsProductCategory();
    }

    //    ============================Authentication============================
    @Steps
    GetUser getUser;
    @Given("I set GET api endpoints user information")
    public void iSetGETApiEndpointsUserInformation() {
        getUser.iSetGETApiEndpointsUserInformation();
    }
    @And("I receive valid data for user information")
    public void iReceiveValidDataForUserInformation() {
        getUser.iReceiveValidDataForUserInformation();
    }

    @Steps
    NGetUser nGetUser;
    @Given("I set unmatched GET api endpoints user information")
    public void iSetUnmatchedGETApiEndpointsUserInformation() {
        nGetUser.iSetUnmatchedGETApiEndpointsUserInformation();
    }

    @Steps
    PostRegister postRegister;
    @Given("I set POST api endpoints register")
    public void iSetPOSTApiEndpointsRegister() {
        postRegister.iSetPOSTApiEndpointsRegister();
    }
    @And("I send POST HTTP request post register")
    public void iSendPOSTHTTPRequestPostRegister() { postRegister.iSendPOSTHTTPRequestPostRegister();
    }

    @Steps
    NPostRegister nPostRegister;
    @Then("I receive valid login and product HTTP response code 405")
    public void iReceiveValidLoginAndProductHTTPResponseCode405() {
        nPostRegister.iReceiveValidLoginAndProductHTTPResponseCode405();
    }

    @And("I receive valid data for register")
    public void iReceiveValidDataForRegister() {
        postRegister.iReceiveValidDataForRegister();
    }

    @Steps
    PostLogin postLogin;
    @Given("I set POST api endpoints login")
    public void iSetPOSTApiEndpointsLogin() {
        postLogin.iSetPOSTApiEndpointsLogin();
    }
    @And("I send POST HTTP request login")
    public void iSendPOSTHTTPRequestLogin() {
        postLogin.iSendPOSTHTTPRequestLogin();
    }
    @And("I receive valid data for login")
    public void iReceiveValidDataForLogin() {
        postLogin.iReceiveValidDataForLogin();
    }

    @Steps
    NPostLogin nPostLogin;
    @Then("I receive valid HTTP response code 400")
    public void iReceiveValidHTTPResponseCode400() {
        nPostLogin.iReceiveValidHTTPResponseCode400();
    }

    //    ============================Hello============================
    @Steps
    GetIndex getIndex;
    @Given("I set GET api endpoints index")
    public void iSetGETApiEndpointsIndex() {
        getIndex.iSetGETApiEndpointsIndex();
    }
    @And("I receive valid data for index")
    public void iReceiveValidDataForIndex() {
        getIndex.iReceiveValidDataForIndex();
    }

    @Steps
    NGetIndex nGetIndex;
    @Given("I set unmatched GET api endpoints index")
    public void iSetUnmatchedGETApiEndpointsIndex() {
        nGetIndex.iSetUnmatchedGETApiEndpointsIndex();
    }

    //    ============================Orders============================
    @Steps
    GetAllOrders getAllOrders;
    @Given("I set GET api endpoints all orders")
    public void iSetGETApiEndpointsAllOrders() {
        getAllOrders.iSetGETApiEndpointsAllOrders();
    }
    @And("I receive valid data for all orders")
    public void iReceiveValidDataForAllOrders() {
        getAllOrders.iReceiveValidDataForAllOrders();
    }

    @Steps
    NGetOrder nGetOrder;
    @Given("I set unmatched GET api endpoints all orders")
    public void iSetUnmatchedGETApiEndpointsAllOrders() {
        nGetOrder.iSetUnmatchedGETApiEndpointsAllOrders();
    }

    @Steps
    GetOrderId getOrderId;
    @Given("I set GET api endpoints order Id")
    public void iSetGETApiEndpointsOrderId() {
        getOrderId.iSetGETApiEndpointsOrderId();
    }
    @And("I receive valid data for order by ID")
    public void iReceiveValidDataForOrderByID() {
        getOrderId.iReceiveValidDataForOrderByID();
    }

    @Steps
    NGetOrderId nGetOrderId;
    @Given("I set unmatched GET api endpoints order Id")
    public void iSetUnmatchedGETApiEndpointsOrderId() {
        nGetOrderId.iSetUnmatchedGETApiEndpointsOrderId();
    }

    @Steps
    PostOrder postOrder;
    @And("I set POST api endpoints order")
    public void iSetPOSTApiEndpointsOrder() {
        postOrder.iSetPOSTApiEndpointsOrder();
    }

    @And("I receive valid data for new order")
    public void iReceiveValidDataForNewOrder() {
        postOrder.iReceiveValidDataForNewOrder();
    }

    @And("I send POST HTTP request post order")
    public void iSendPOSTHTTPRequestPostOrder() { postOrder.iSendPOSTHTTPRequestPostOrder();
    }

    @Steps
    NPostOrder nPostOrder;
    @And("I set unmatched POST api endpoints order")
    public void iSetUnmatchedPOSTApiEndpointsOrder() {
        nPostOrder.iSetUnmatchedPOSTApiEndpointsOrder();
    }

}
