package adapters;

import interfaces.*;
import ducks.*;

public class PigeonAdapter implements Quackable {
    private Pigeon pigeon;

    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
