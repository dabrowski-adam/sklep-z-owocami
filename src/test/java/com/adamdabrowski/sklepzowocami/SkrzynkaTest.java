package com.adamdabrowski.sklepzowocami;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SkrzynkaTest {

    @Test
    public void testDodaj() {
        Skrzynka skrzynka = new Skrzynka();
        Jablko jablko = new Jablko(1, 4);
        Gruszka gruszka = new Gruszka(0.3, 5);

        double waga = gruszka.waga + jablko.waga;
        double cena = gruszka.waga * gruszka.cena
                + jablko.waga * jablko.cena;

        skrzynka.dodaj(jablko);
        skrzynka.dodaj(gruszka);

        assertEquals(waga, skrzynka.podajWage());
        assertEquals(cena, skrzynka.podajCene());

        Sliwka sliwka = new Sliwka(3, 7);
        assertFalse(skrzynka.dodaj(sliwka));

        assertEquals(waga, skrzynka.podajWage());
        assertEquals(cena, skrzynka.podajCene());
    }

    @Test
    public void testUsun() {
        Skrzynka skrzynka = new Skrzynka();
        Gruszka gruszka = new Gruszka(0.5, 5);
        Jablko jablko = new Jablko(1, 3);
        Sliwka sliwka = new Sliwka(0.5, 7);

        skrzynka.dodaj(gruszka);
        skrzynka.dodaj(jablko);
        skrzynka.dodaj(sliwka);

        assertEquals(gruszka.waga + jablko.waga + sliwka.waga,
                skrzynka.podajWage());
        assertEquals(gruszka.waga * gruszka.cena
                        + jablko.waga * jablko.cena
                        + sliwka.waga * sliwka.cena,
                skrzynka.podajCene());

        skrzynka.usun(sliwka);

        assertEquals(gruszka.waga + jablko.waga,
                skrzynka.podajWage());
        assertEquals(gruszka.waga * gruszka.cena
                        + jablko.waga * jablko.cena,
                skrzynka.podajCene());
    }
}