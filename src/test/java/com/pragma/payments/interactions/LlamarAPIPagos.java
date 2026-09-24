package com.pragma.payments.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;

public class LlamarAPIPagos implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        // Implementar lógica para llamar a la API de pagos
    }

    public static Interaction llamarAPIPagos() {
        return new LlamarAPIPagos();
    }
}