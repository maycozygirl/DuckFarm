package abstracts;

import adapters.GooseAdapter;
import adapters.PigeonAdapter;
import interfaces.Quackable;
import ducks.*;


public class DuckFactory extends AbstractDuckFactory {
    
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    public Quackable createRedHeadDuck() {
        return new RedheadDuck();
    }

    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    public Quackable createDuckCall() {
        return new DuckCall();
    }

    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }

    public Quackable createPigeon() {
        return new PigeonAdapter(new Pigeon());
    }
}
