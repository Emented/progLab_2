package moves;

import ru.ifmo.se.pokemon.*;

public class DragonDance extends StatusMove {
    public DragonDance() {
        super(Type.DRAGON, 0, 0);
    }

    @Override
    protected String describe() {
        return "Использует Dragom Dance";
    }

    @Override
    protected void applySelfEffects(Pokemon def) {
        def.setMod(Stat.ATTACK, 1);
        def.setMod(Stat.SPEED, 1);
    }
}
