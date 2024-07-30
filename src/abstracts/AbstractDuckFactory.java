package abstracts;

import interfaces.Quackable;


public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedHeadDuck();
    public abstract Quackable createRubberDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createGoose();
    public abstract Quackable createPigeon();
}