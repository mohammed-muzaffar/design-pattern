package DecoratorDesignPattern;

public class Assignment extends DecoratorClass {

    Member m;

    public  Assignment(Member member) {
        this.m = member;
    }

    @Override
    public int cost() {
       return 500 + m.cost();
    }
    
}
