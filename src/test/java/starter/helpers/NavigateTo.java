package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theAltaShopHomePage() {
        return Task.where("{0} opens the AltaShop home page",
                Open.browserOn().the(AltaShopPage.class));
    }
}
