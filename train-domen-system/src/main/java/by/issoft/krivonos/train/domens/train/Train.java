package by.issoft.krivonos.train.domens.train;

import by.issoft.krivonos.train.domens.wagons.Wagon;

import java.util.Collection;
import java.util.Set;

public interface Train extends Collection<Wagon> {

    int getWeight();

    String getId();

    Wagon getHead();

    Set<Wagon> getTail();
}
