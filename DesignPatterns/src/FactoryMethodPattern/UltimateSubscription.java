package FactoryMethodPattern;

public class UltimateSubscription extends Subscription {

    @Override
    protected void createSubscription() {
        features.add(new BlockMalware());
        features.add(new BlockWebCamSpy());
        features.add(new AutomaticAppUpdate());
        features.add(new VPNService());
    }
}
