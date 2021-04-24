package by.issoft.krivonos.train.domens.wagons;

import by.issoft.krivonos.train.domens.wagons.freightwagon.TypeFreightWagon;

import java.util.UUID;

public class Wagon {

    private UUID id;
    private int weight;
    private TypeFreightWagon typeFreightWagon;

    public Wagon(int weight) {
        this.weight = weight;
    }

    public Wagon() {
    }
}
