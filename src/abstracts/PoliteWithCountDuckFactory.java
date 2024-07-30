package abstracts;

import adapters.*;
import decorators.*;
import ducks.*;
import interfaces.*;

public class PoliteWithCountDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new PoliteQuack(new QuackCounter(new MallardDuck()));
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new PoliteQuack(new QuackCounter(new RedheadDuck()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new PoliteQuack(new QuackCounter(new RubberDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new PoliteQuack(new QuackCounter(new DuckCall()));
    }

    @Override
    public Quackable createGoose() {
        return new PoliteQuack(new QuackCounter(new GooseAdapter(new Goose())));
    }

    @Override
    public Quackable createPigeon() {
        return new PoliteQuack(new QuackCounter(new PigeonAdapter(new Pigeon())));
    }

}