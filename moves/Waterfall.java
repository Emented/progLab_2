package moves;

import ru.ifmo.se.pokemon.*;

public class Waterfall extends PhysicalMove {
    public Waterfall() {
        super(Type.WATER, 80, 100);
    }

    @Override
    protected String describe() {
        return "Использует Waterfall";
    }

    @Override
    protected void applyOppEffects(Pokemon enemy) {
        if (Math.random() < 0.2) {
            Effect.flinch(enemy);
        }
    }
}
