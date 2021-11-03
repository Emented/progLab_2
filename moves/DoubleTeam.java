package moves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected String describe() {
        return "Использует Double Team";
    }

    @Override
    protected void applySelfEffects(Pokemon def) {
        def.setMod(Stat.EVASION, 1);
    }
}
