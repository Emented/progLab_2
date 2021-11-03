package moves;

import ru.ifmo.se.pokemon.*;

public class IceShard extends PhysicalMove {
    public IceShard() {
        super(Type.ICE, 40, 100);
    }

    @Override
    protected String describe() {
        return "Использует Ice Shard";
    }
}
