package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Darumaka extends Pokemon {
    public Darumaka (String name, int lvl) {
        super(name, lvl);
        setStats(70, 90, 45, 15, 45, 50);
        setType(Type.FIRE);
        setMove(new DoubleTeam(), new Swagger(), new SludgeBomb());
    }
}
