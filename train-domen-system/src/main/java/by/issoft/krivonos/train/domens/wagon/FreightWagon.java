package by.issoft.krivonos.train.domens.wagon;

import by.issoft.krivonos.train.domens.cargos.Cargo;

import java.util.UUID;

public class FreightWagon extends Wagon {
    private UUID id;
    private Cargo cargo;

    public FreightWagon(Cargo cargo) {
        this.cargo = cargo;
    }
}
