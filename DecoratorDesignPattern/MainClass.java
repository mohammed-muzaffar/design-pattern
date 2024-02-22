package DecoratorDesignPattern;

public class MainClass {
    public static void main(String[] args) {
        Member lifeTime = new LiftTimeSubscription();
        Member assign = new Assignment(lifeTime);
        Member doubt = new DoubtSession(assign);

        System.out.println("Total Cost: " + doubt.cost());

    }
}
