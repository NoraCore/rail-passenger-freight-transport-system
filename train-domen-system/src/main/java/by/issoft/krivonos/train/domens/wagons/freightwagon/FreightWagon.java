package by.issoft.krivonos.train.domens.wagons.freightwagon;

import by.issoft.krivonos.train.domens.cargos.Cargo;
import by.issoft.krivonos.train.domens.wagons.Wagon;

public class FreightWagon extends Wagon {

    private int volume;
    private int weight;
    private int loading;
    private Cargo cargo;

    public FreightWagon(Cargo cargo) {
        this.cargo = cargo;
    }
}
