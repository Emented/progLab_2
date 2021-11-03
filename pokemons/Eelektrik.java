package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Eelektrik extends Pokemon {
    public Eelektrik(String name, int lvl) {
        super(name, lvl);
        setStats(65, 85, 70, 75, 70, 40);
        setType(Type.ELECTRIC);
        setMove(new Swagger(), new RockTomb(), new IceShard());
    }
}
