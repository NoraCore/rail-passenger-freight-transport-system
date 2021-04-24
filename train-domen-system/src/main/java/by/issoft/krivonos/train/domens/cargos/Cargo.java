package by.issoft.krivonos.train.domens.cargos;

import java.util.UUID;

public class Cargo {
    private UUID id;
    private CargoType cargoType;
    private int weight;

    public Cargo(UUID id, CargoType cargoType, int weight) {
        this.id = id;
        this.cargoType = cargoType;
        this.weight = weight;
    }


}
