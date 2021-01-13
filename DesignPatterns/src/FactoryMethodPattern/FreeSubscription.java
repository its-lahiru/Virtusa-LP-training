package FactoryMethodPattern;

public class FreeSubscription extends Subscription {

    @Override
    protected void createSubscription() {
        features.add(new BlockMalware());
        features.add(new BlockWebCamSpy());
    }
}
