package com.adamdabrowski.sklepzowocami;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Skrzynka implements Kontener<Owoc> {
    private List<Owoc> owoce;

    public Skrzynka() {
        owoce = new ArrayList<>();
    }

    public boolean dodaj(Owoc owoc) {
        if (owoc == null || (podajWage() + owoc.waga) > 2) {
            return false;
        }

        return owoce.add(owoc);
    }

    public boolean usun(Owoc owoc) {
        if (owoc == null || !owoce.contains(owoc)) {
            return false;
        }

        return owoce.remove(owoc);
    }

    public List<Owoc> pobierzWszystkie() {
        return Collections.unmodifiableList(owoce);
    }

    public double podajCene() {
        return owoce.stream().mapToDouble(o -> o.waga * o.cena).sum();
    }

    public double podajWage() {
        return owoce.stream().mapToDouble(o -> o.waga).sum();
    }
}
