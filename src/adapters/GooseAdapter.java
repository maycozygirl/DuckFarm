package adapters;

import interfaces.Quackable;
import ducks.Goose;

public class GooseAdapter implements Quackable {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    
    public void quack() {
        goose.honk();
    }
}
