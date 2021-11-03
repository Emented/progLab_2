import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main (String[] args){
        Battle b = new Battle();

        Eelektross pokemon1 = new Eelektross("voin_1", 65);
        Darumaka pokemon2 = new Darumaka("archer_1", 28);
        Eelektrik pokemon3 = new Eelektrik("castle_1", 90);
        Tynamo pokemon4 = new Tynamo("voin_2", 45);
        Unown pokemon5 = new Unown("archer_2", 56);
        DarmanitanStandard pokemon6 = new DarmanitanStandard("castle_2", 66);

        b.addAlly(pokemon1);
        b.addAlly(pokemon2);
        b.addAlly(pokemon3);

        b.addFoe(pokemon4);
        b.addFoe(pokemon5);
        b.addFoe(pokemon6);

        b.go();
    }

}