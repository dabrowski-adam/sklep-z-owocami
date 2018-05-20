package com.adamdabrowski.sklepzowocami;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Owoc {
    double waga;
    double cena;

    public Owoc(double waga, double cena) {
        this.waga = waga;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append(waga)
                .append(cena)
                .build();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) { return false; }

        Owoc rhs = (Owoc) obj;
        return new EqualsBuilder()
                .appendSuper(super.equals(obj))
                .append(waga, rhs.waga)
                .append(cena, rhs.cena)
                .isEquals();
    }
}
