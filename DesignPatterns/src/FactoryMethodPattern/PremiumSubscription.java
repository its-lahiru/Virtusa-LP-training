package FactoryMethodPattern;

public class PremiumSubscription extends Subscription {

    @Override
    protected void createSubscription() {
        features.add(new BlockMalware());
        features.add(new BlockWebCamSpy());
        features.add(new AutomaticAppUpdate());
    }

}
