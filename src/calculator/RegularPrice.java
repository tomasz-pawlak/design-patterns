package calculator;

public class RegularPrice implements PricingStrategy {
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (isSignedUpForNewsletter==false){
            System.out.println(price);;
        }else {
            System.out.println("nie zapisano do newslettera");
        }
    }
}
