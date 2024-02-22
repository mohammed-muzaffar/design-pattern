package DecoratorDesignPattern;

public class LiftTimeSubscription implements Member {

    @Override
    public int cost() {
        return 1500;
    }

}
