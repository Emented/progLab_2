package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Eelektross extends Pokemon {
    public Eelektross(String name, int lvl) {
        super(name, lvl);
        setStats(85, 115, 80, 105, 80, 50);
        setType(Type.ELECTRIC);
        setMove(new Swagger(), new RockTomb(), new IceShard());
    }
}
