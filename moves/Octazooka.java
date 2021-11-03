package moves;

import ru.ifmo.se.pokemon.*;

public class Octazooka extends SpecialMove{
    public Octazooka() {
        super(Type.WATER, 65, 85);
    }

    @Override
    protected String describe() {
        return "Использует Octazooka";
    }

    @Override
    protected void applyOppEffects(Pokemon enemy) {
        if (enemy.getStat(Stat.ACCURACY) > -6) {
            if (Math.random() < 0.5) {
                enemy.setMod(Stat.ACCURACY, -1);
            }
        }
    }
}
