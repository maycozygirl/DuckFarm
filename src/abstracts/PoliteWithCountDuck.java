package abstracts;
import adapters.*;
import decorators.*;
import interfaces.*;
import ducks.*;

public class PoliteWithCountDuck extends AbstractDuckFactory {

    public Quackable createMallardDuck() {
        return new PoliteQuack(new QuackCounter(new MallardDuck()));
    }

    public Quackable createRedHeadDuck() {
        return new PoliteQuack(new QuackCounter(new RedheadDuck()));
    }

    public Quackable createRubberDuck() {
        return new PoliteQuack(new QuackCounter(new RubberDuck()));
    }

    public Quackable createDuckCall() {
        return new PoliteQuack(new QuackCounter(new DuckCall()));
    }

    public Quackable createGoose() {
        return new PoliteQuack(new QuackCounter(new GooseAdapter(new Goose())));
    }

    public Quackable createPigeon() {
        return new PoliteQuack(new QuackCounter(new PigeonAdapter(new Pigeon())));
    }
}
