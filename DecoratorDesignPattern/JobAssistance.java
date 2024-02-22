package DecoratorDesignPattern;

public class JobAssistance extends DecoratorClass {

    Member m;

    public JobAssistance(Member m) {
        this.m = m;
    }

    @Override
    public int cost() {
        return 1500 + m.cost();
    }
}