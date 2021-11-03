package moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {

    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected String describe() {
        return "Использует Swagger";
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        defender.setMod(Stat.ATTACK, 2);
        Effect.confuse(defender);
    }
}