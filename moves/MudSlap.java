package moves;

import ru.ifmo.se.pokemon.*;

public class MudSlap extends StatusMove {
    public MudSlap() {
        super(Type.GROUND, 20, 100);
    }

    @Override
    protected String describe() {
        return "Использует Mud-Slap";
    }

    @Override
    protected void applyOppEffects(Pokemon enemy) {
        enemy.setMod(Stat.ACCURACY, -1);
    }
}
