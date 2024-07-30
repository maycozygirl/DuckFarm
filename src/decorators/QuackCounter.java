package decorators;
import interfaces.Quackable;


public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks = 0;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
    
}
