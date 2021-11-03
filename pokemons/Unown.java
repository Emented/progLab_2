package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Unown extends Pokemon {
    public Unown(String name, int lvl) {
        super(name, lvl);
        setStats(48, 72, 48, 72, 48, 48);
        setType(Type.PSYCHIC);
        setMove(new DragonDance(), new BubbleBeam(), new Octazooka(), new Waterfall());
    }
}
