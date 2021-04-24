package by.issoft.krivonos.train;

import by.issoft.krivonos.train.domens.cargos.Cargo;
import by.issoft.krivonos.train.domens.cargos.TypeCargo;
import by.issoft.krivonos.train.domens.train.Train;
import by.issoft.krivonos.train.domens.train.TrainLinks;
import by.issoft.krivonos.train.domens.wagons.Wagon;
import by.issoft.krivonos.train.domens.wagons.carriages.Carriage;
import by.issoft.krivonos.train.domens.wagons.freightwagon.FreightWagon;
import by.issoft.krivonos.train.domens.wagons.locomotives.Locomotive;

import java.util.UUID;

public class Runner {
    public static void main(String[] args) {
        Train train = new TrainLinks();
        train.getWeight();
        Train trainTest = new TrainLinks();
        trainTest.add(new Locomotive());
        trainTest.add(new Wagon());
        trainTest.add(new FreightWagon(new Cargo(UUID.randomUUID(), TypeCargo.CHEMICALS, 1000)));
        trainTest.add(new Carriage());

    }
}
