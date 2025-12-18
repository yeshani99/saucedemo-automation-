package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

public class SauceDemoTest extends BaseTest {

    @Test
    public void endToEndPurchaseTest() {

        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");

        ProductsPage products = new ProductsPage(driver);
        products.addProduct();
        products.openCart();

        CartPage cart = new CartPage(driver);
        cart.checkout();

        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.completeCheckout();
    }
}

