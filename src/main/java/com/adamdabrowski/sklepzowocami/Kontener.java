package com.adamdabrowski.sklepzowocami;

import java.util.List;

public interface Kontener<T> {
    boolean dodaj(T obj);
    boolean usun(T obj);
    List<T> pobierzWszystkie();
}
