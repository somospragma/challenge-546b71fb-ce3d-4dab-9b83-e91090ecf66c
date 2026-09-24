package com.pragma.payments.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarPago implements Task {

    private String monto;
    private String cuentaDestino;

    public static RealizarPago conMontoYCuenta(String monto, String cuentaDestino) {
        return instrumented(RealizarPago.class, monto, cuentaDestino);
    }

    public RealizarPago(String monto, String cuentaDestino) {
        this.monto = monto;
        this.cuentaDestino = cuentaDestino;
    }

    @Override
    @Step("#actor realiza un pago de #monto a #cuentaDestino")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://example.com/pagos"),
                Post.to("/realizarPago").with(
                        request -> request.body("{\"monto\":\"" + monto + "\",\"cuentaDestino\":\"" + cuentaDestino + "}")
                )
        );
    }
}