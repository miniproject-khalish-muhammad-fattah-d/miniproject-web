package starter.helpers;

import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Locale;

public class DoAnAction {
    public static Performable clickSignInButton() {
        return Task.where("{0} click sign in button",
                Click.on(AltaShopPage.SIGNIN_BUTTON)
        );
    }

    public static Performable fillValidAltaShopEmail(String email) {
        return Task.where("{0} fill altashop email field with " + email,
                Enter.theValue(email)
                        .into(AltaShopPage.EMAIL_FIELD)
        );
    }

    public static Performable fillValidAltaShopPassword(String password) {
        return Task.where("{0} fill altashop password field with " + password,
                Enter.theValue(password)
                        .into(AltaShopPage.PASSWORD_FIELD)
        );
    }

    public static Performable clickSubmitLoginButton() {
        return Task.where("{0} click submit login button",
                Click.on(AltaShopPage.SUBMITLOGIN_BUTTON)
        );
    }

    public static Performable clickBeliProdukPertamaButton() {
        return Task.where("{0} click beli produk pertama button",
                Click.on(AltaShopPage.BELIPERTAMA_BUTTON)
        );
    }

    public static Performable clickBeliProdukKeduaButton() {
        return Task.where("{0} click beli produk kedua button",
                Click.on(AltaShopPage.BELIKEDUA_BUTTON)
        );
    }

    public static Performable clickBeliProdukKetigaButton() {
        return Task.where("{0} click beli produk ketiga button",
                Click.on(AltaShopPage.BELIKETIGA_BUTTON)
        );
    }

    public static Performable clickCartButton() {
        return Task.where("{0} click cart button",
                Click.on(AltaShopPage.CART_BUTTON)
        );
    }

    public static Performable clickPlusProdukPertamaButton() {
        return Task.where("{0} click plus produk pertama button",
                Click.on(AltaShopPage.PLUSPERTAMA_BUTTON)
        );
    }

    public static Performable clickPlusProdukKeduaButton() {
        return Task.where("{0} click plus produk kedua button",
                Click.on(AltaShopPage.PLUSKEDUA_BUTTON)
        );
    }

    public static Performable clickPlusProdukKetigaButton() {
        return Task.where("{0} click plus produk ketiga button",
                Click.on(AltaShopPage.PLUSKETIGA_BUTTON)
        );
    }

    public static Performable clickBayarButton() {
        return Task.where("{0} click bayar button",
                Click.on(AltaShopPage.BAYAR_BUTTON)
        );
    }

    public static Performable clickDetailButton() {
        return Task.where("{0} click detail button",
                Click.on(AltaShopPage.DETAIL_BUTTON)
        );
    }

    public static Performable clickRatingButton() {
        return Task.where("{0} click rating button",
                Click.on(AltaShopPage.RATING_BUTTON)
        );
    }

    public static Performable clickProfileButton() {
        return Task.where("{0} click profile button",
                Click.on(AltaShopPage.PROFILE_BUTTON)
        );
    }

    public static Performable clickTransactionsButton() {
        return Task.where("{0} click transactions button",
                Click.on(AltaShopPage.TRANSACTIONS_BUTTON)
        );
    }

    public static Performable clickCategoryBar() {
        return Task.where("{0} click category bar",
                Click.on(AltaShopPage.CATEGORY_BAR)
        );
    }

    public static Performable clickCategoryOption() {
        return Task.where("{0} click category option",
                Click.on(AltaShopPage.CATEGORY_OPTION)
        );
    }

    public static Performable clickRegisterButton() {
        return Task.where("{0} click register button",
                Click.on(AltaShopPage.REGISTER_BUTTON)
        );
    }

    public static Performable clickSubmitRegisterButton() {
        return Task.where("{0} click submit register button",
                Click.on(AltaShopPage.SUBMITREGISTER_BUTTON)
        );
    }

    public static Performable fillRegisterFullnameField(String randomFullname) {
        return Task.where("{0} fill register fullname field with " + randomFullname,
                Enter.theValue(randomFullname)
                        .into(AltaShopPage.REGFULLNAME_FIELD)
        );
    }

    public static Performable fillRegisterEmailField(String randomEmail) {
        return Task.where("{0} fill register email field with " + randomEmail,
                Enter.theValue(randomEmail)
                        .into(AltaShopPage.REGEMAIL_FIELD)
        );
    }

    public static Performable fillRegisterPasswordField(String randomPassword) {
        return Task.where("{0} fill register password field with " + randomPassword,
                Enter.theValue(randomPassword)
                        .into(AltaShopPage.REGPASSWORD_FIELD)
        );
    }

    public static Performable clickLogoutButton() {
        return Task.where("{0} click logout button",
                Click.on(AltaShopPage.LOGOUT_BUTTON)
        );
    }
}
