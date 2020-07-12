package calculator;

public class SalePrice implements PricingStrategy {
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (isSignedUpForNewsletter == true) {
            System.out.println(price / 2);
        } else {
            System.out.println("nieprawda to jest");
        }
    }
}
