package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class DarmanitanStandard extends Pokemon {
    public DarmanitanStandard(String name, int lvl) {
        super(name, lvl);
        setStats(105, 140, 55, 30, 55, 95);
        setType(Type.FIRE);
        setMove(new DoubleTeam(), new Swagger(), new SludgeBomb(), new MudSlap());
    }
}
