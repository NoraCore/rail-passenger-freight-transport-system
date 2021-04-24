package by.issoft.krivonos.train.domens.train;

import by.issoft.krivonos.train.domens.cargos.Cargo;
import by.issoft.krivonos.train.domens.cargos.TypeCargo;
import by.issoft.krivonos.train.domens.wagons.Wagon;
import by.issoft.krivonos.train.domens.wagons.carriages.Carriage;
import by.issoft.krivonos.train.domens.wagons.freightwagon.FreightWagon;
import by.issoft.krivonos.train.domens.wagons.locomotives.Locomotive;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

class TrainLinksTest {

    @Test
    void getWeight() {
        Train trainTest = new TrainLinks();

    }

    @Test
    void getId() {
    }

    @Test
    void getHead() {
    }

    @Test
    void getTail() {
    }

    @Test
    void size() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void contains() {
    }

    @Test
    void addWagonReturn() {
        Train trainTest = new TrainLinks();
        trainTest.add(new Locomotive());
        trainTest.add(new Wagon());
        trainTest.add(new FreightWagon(new Cargo(UUID.randomUUID(), TypeCargo.CHEMICALS, 1000)));
        trainTest.add(new Carriage());
        assertThat(trainTest, notNullValue());
        assertThat(trainTest.size(), is(equalTo(4)));
    }

    @Test
    void remove() {
    }

    @Test
    void containsAll() {
    }

    @Test
    void addAll() {
    }

    @Test
    void removeAll() {
    }

    @Test
    void retainAll() {
    }

    @Test
    void clear() {
    }
}