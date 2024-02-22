package DecoratorDesignPattern;

public class DoubtSession extends DecoratorClass {
    Member m;

    public DoubtSession(Member member) {
        this.m = member;
    }

    @Override
    public int cost() {
        return 1000 + m.cost();
    }
}
