package starter.stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.helpers.DoAnAction;
import starter.helpers.NavigateTo;
import starter.helpers.AltaShopPage;

import java.util.Locale;

public class AltaShopSDBDD {
    @Given("{actor} is on altashop home page")
    public void userIsOnAltashopHomePage(Actor actor) {
        actor.wasAbleTo(NavigateTo.theAltaShopHomePage());
    }

    @When("{actor} click on the altashop sign in button")
    public void userClickOnTheAltashopSignInButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickSignInButton());
    }

    @And("{actor} input {string} into email field")
    public void userInputIntoEmailField(Actor actor, String email) {
        actor.attemptsTo(DoAnAction.fillValidAltaShopEmail(email));
    }

    @And("{actor} input {string} into password field")
    public void userInputIntoPasswordField(Actor actor, String password) {
        actor.attemptsTo(DoAnAction.fillValidAltaShopPassword(password));
    }

    @And("{actor} click on the altashop submit login button")
    public void userClickOnTheAltashopSubmitLoginButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickSubmitLoginButton());
    }

    @Then("{actor} see {string} text on catalog page")
    public void userSeeTextOnCatalogPage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(AltaShopPage.CATALOG_PAGE).hasText(text));
    }

    @Given("{actor} is logged in on altashop with email {string} and password {string}")
    public void userIsLoggedInOnAltashopWithEmailAndPassword(Actor actor, String email, String password) {
        userIsOnAltashopHomePage(actor);
        userClickOnTheAltashopSignInButton(actor);
        userInputIntoEmailField(actor, email);
        userInputIntoPasswordField(actor, password);
        userClickOnTheAltashopSubmitLoginButton(actor);
    }

    @When("{actor} click on beli button on the products")
    public void userClickOnBeliButtonOnTheProducts(Actor actor) {
        actor.attemptsTo(DoAnAction.clickBeliProdukPertamaButton());
        actor.attemptsTo(DoAnAction.clickBeliProdukKeduaButton());
        actor.attemptsTo(DoAnAction.clickBeliProdukKetigaButton());
    }

    @And("{actor} click on cart button")
    public void userClickOnCartButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickCartButton());
    }

    @And("{actor} click on plus button on some products to add the quantity")
    public void userClickOnPlusButtonOnSomeProductsToAddTheQuantity(Actor actor) {
        actor.attemptsTo(DoAnAction.clickPlusProdukPertamaButton());
        actor.attemptsTo(DoAnAction.clickPlusProdukKeduaButton());
        actor.attemptsTo(DoAnAction.clickPlusProdukKetigaButton());
    }

    @And("{actor} check the total payment of the products by seeing this {string} text")
    public void userCheckTheTotalPaymentOfTheProductsBySeeingThisText(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(AltaShopPage.CART_PAGE).hasText(text));
    }

    @And("{actor} click on bayar button on cart page")
    public void userClickOnBayarButtonOnCartPage(Actor actor) {
        actor.attemptsTo(DoAnAction.clickBayarButton());
    }

    @Then("{actor} see {string} text on transactions page")
    public void userSeeTextOnTransactionsPage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(AltaShopPage.TRANSACTIONS_PAGE).hasText(text));
    }

    @Then("{actor} see {string} text on cart page")
    public void userSeeTextOnCartPage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(AltaShopPage.EMPTYCART_PAGE).hasText(text));
    }

    @And("{actor} click on detail button on one of the products")
    public void userClickOnDetailButtonOnOneOfTheProducts(Actor actor) {
        actor.attemptsTo(DoAnAction.clickDetailButton());
    }

    @Then("{actor} can click on rating products button")
    public void userCanClickOnRatingProductsButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickRatingButton());
    }

    @When("{actor} click on profile button")
    public void userClickOnProfileButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickProfileButton());
    }

    @And("{actor} click on transactions button")
    public void userClickOnTransactionsButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickTransactionsButton());
    }

    @And("{actor} can see {string} text on transactions button")
    public void userCanSeeTextOnTransactionsButton(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(AltaShopPage.TRANSACTIONS_DROPDOWN).hasText(text));
    }

    @Then("{actor} can click on category bar")
    public void userClickOnCategoryBar(Actor actor) {
        actor.attemptsTo(DoAnAction.clickCategoryBar());
    }

    @And("{actor} click on one of the category option")
    public void userClickOnOneOfTheCategoryOption(Actor actor) {
        actor.attemptsTo(DoAnAction.clickCategoryOption());
    }

    @Then("{actor} see {string} text on category page")
    public void userSeeTextOnCategoryPage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(AltaShopPage.CATEGORY_PAGE).hasText(text));
    }

    @Then("{actor} see {string} text on category list")
    public void userSeeTextOnCategoryList(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(AltaShopPage.CATEGORY_LIST).hasText(text));
    }

    @Then("{actor} see {string} text on login page")
    public void userSeeTextOnSignInPage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(AltaShopPage.LOGIN_PAGE).hasText(text));
    }

    @Then("{actor} got redirected to sign in page and see {string} text")
    public void userGotRedirectedToSignInPageAndSeeText(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(AltaShopPage.SIGNIN_PAGE).hasText(text));
    }

    @And("{actor} click on register button")
    public void userClickOnRegisterButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickRegisterButton());
    }

    @And("{actor} input {string} into register fullname field")
    public void userInputIntoRegisterFullnameField(Actor actor, String randomFullname) {
        Faker faker = new Faker(new Locale("in-ID"));
        randomFullname = faker.name().fullName();
        actor.attemptsTo(DoAnAction.fillRegisterFullnameField(randomFullname));
    }

    @And("{actor} input {string} into register email field")
    public void userInputIntoRegisterEmailField(Actor actor, String randomEmail) {
        Faker faker = new Faker(new Locale("in-ID"));
        randomEmail = faker.internet().emailAddress();
        actor.attemptsTo(DoAnAction.fillRegisterEmailField(randomEmail));
    }

    @And("{actor} input {string} into register password field")
    public void userInputIntoRegisterPasswordField(Actor actor, String randomPassword) {
        Faker faker = new Faker(new Locale("in-ID"));
        randomPassword = faker.internet().password();
        actor.attemptsTo(DoAnAction.fillRegisterPasswordField(randomPassword));
    }

    @And("{actor} click on the altashop submit register button")
    public void userClickOnTheAltashopSubmitRegisterButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickSubmitRegisterButton());
    }

    @And("{actor} click on logout button")
    public void userClickOnLogoutButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickLogoutButton());
    }
}
