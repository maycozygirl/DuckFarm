package abstracts;
import adapters.*;
import interfaces.*;
import decorators.*;
import ducks.*;

public class CountingDuckFactory  extends AbstractDuckFactory {
    
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    public Quackable createRedHeadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }

    public Quackable createPigeon() {
        return new PigeonAdapter(new Pigeon());
    }
    
}
