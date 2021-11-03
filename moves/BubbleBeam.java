package moves;

import ru.ifmo.se.pokemon.*;

public class BubbleBeam extends SpecialMove {
    public BubbleBeam() {
        super(Type.WATER, 65, 100);
    }

    @Override
    protected String describe() {
        return "Использует Bubble Beam";
    }

    @Override
    protected void applyOppEffects(Pokemon enemy) {
        if (enemy.getStat(Stat.SPEED) > -6) {
            if (Math.random() < 0.1) {
                enemy.setMod(Stat.SPEED, -1);
            }
        }
    }
}
