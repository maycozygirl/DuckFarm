package decorators;
import interfaces.Quackable;


public class PoliteQuack implements Quackable {
    
    private Quackable duck;

    public PoliteQuack(Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.quack();
        System.out.print("Krabbb");
    }

}
