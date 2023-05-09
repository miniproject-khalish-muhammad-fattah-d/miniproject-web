package starter.helpers;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://alta-shop.vercel.app/")
public class AltaShopPage extends PageObject {
    public static Target SIGNIN_BUTTON = Target.the("sign in button").located(By.xpath("//header/div[1]/button[2]"));
    public static Target SUBMITLOGIN_BUTTON = Target.the("submit login button").located(By.xpath("//body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/button[1]"));
    public static Target EMAIL_FIELD = Target.the("altashop email field").locatedBy("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public static Target PASSWORD_FIELD = Target.the("altashop password field").locatedBy("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]");
    public static Target CATALOG_PAGE = Target.the("text AltaShop").located(By.xpath("//h3[contains(text(),'AltaShop')]"));
    public static Target BELIPERTAMA_BUTTON = Target.the("beli produk pertama button").locatedBy("//body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/button[2]");
    public static Target BELIKEDUA_BUTTON = Target.the("beli produk kedua button").locatedBy("//body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/button[2]");
    public static Target BELIKETIGA_BUTTON = Target.the("beli produk ketiga button").locatedBy("//body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/div[2]/button[2]");
    public static Target CART_BUTTON = Target.the("cart button").locatedBy("//header/div[1]/button[1]");
    public static Target PLUSPERTAMA_BUTTON = Target.the("plus produk pertama button").locatedBy("//body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]");
    public static Target PLUSKEDUA_BUTTON = Target.the("plus produk kedua button").locatedBy("//body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[2]");
    public static Target PLUSKETIGA_BUTTON = Target.the("plus produk ketiga button").locatedBy("//body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/button[2]");
    public static Target CART_PAGE = Target.the("text Total Bayar").locatedBy("//div[contains(text(),'Total Bayar')]");
    public static Target BAYAR_BUTTON = Target.the("bayar button").located(By.id("button-bayar"));
    public static Target TRANSACTIONS_PAGE = Target.the("text Transactions").locatedBy("//h1[contains(text(),'Transactions')]");
    public static Target EMPTYCART_PAGE = Target.the("text Order is empty!").locatedBy("//div[contains(text(),'Order is empty!')]");
    public static Target DETAIL_BUTTON = Target.the("detail produk button").locatedBy("//body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/button[1]");
    public static Target RATING_BUTTON = Target.the("rating produk button").locatedBy("//body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[5]");
    public static Target PROFILE_BUTTON = Target.the("profile button").locatedBy("//header/div[1]/button[2]");
    public static Target TRANSACTIONS_BUTTON = Target.the("transactions button").locatedBy("//body/div[@id='app']/div[2]/div[1]/div[1]/div[1]");
    public static Target TRANSACTIONS_DROPDOWN = Target.the("Transactions Dropdown").locatedBy("//div[contains(text(),'Transaksi')]");
    public static Target CATEGORY_BAR = Target.the("category bar").locatedBy("//body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]");
    public static Target CATEGORY_OPTION = Target.the("category option").locatedBy("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]");
    public static Target CATEGORY_PAGE = Target.the("text Products is empty!").locatedBy("//div[contains(text(),'Products is empty!')]");
    public static Target CATEGORY_LIST = Target.the("category list").locatedBy("//body/div[@id='app']/div[3]/div[1]/div[6]/div[1]/div[1]");
    public static Target LOGIN_PAGE = Target.the("text record not found").locatedBy("//div[contains(text(),'record not found')]");
    public static Target SIGNIN_PAGE = Target.the("sign in page").locatedBy("//div[contains(text(),'Login')]");
    public static Target REGISTER_BUTTON = Target.the("register button").locatedBy("//a[contains(text(),'Register')]");
    public static Target SUBMITREGISTER_BUTTON = Target.the("submit register button").locatedBy("//body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/button[1]");
    public static Target REGFULLNAME_FIELD = Target.the("register fullname field").locatedBy("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public static Target REGEMAIL_FIELD = Target.the("register email field").locatedBy("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]");
    public static Target REGPASSWORD_FIELD = Target.the("register password field").locatedBy("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]");
    public static Target LOGOUT_BUTTON = Target.the("log out button").locatedBy("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]");
}
