package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Tynamo extends Pokemon {
    public Tynamo(String name, int lvl) {
        super(name, lvl);
        setStats(35, 55, 40, 45, 40, 60);
        setType(Type.ELECTRIC);
        setMove(new Swagger(), new RockTomb());
    }
}
