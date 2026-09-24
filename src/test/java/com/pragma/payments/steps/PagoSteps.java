package com.pragma.payments.steps;

import com.pragma.payments.tasks.RealizarPago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

public class PagoSteps {
    @Step("{0} realiza un pago de {1} a {2}")
    public void realizarPago(Actor actor, String monto, String cuentaDestino) {
        actor.attemptsTo(
                RealizarPago.conMontoYCuenta(monto, cuentaDestino)
        );
    }

    @Step("{0} verifica que el saldo de {1} es {2}")
    public void verificarSaldo(Actor actor, String cuenta, String saldoEsperado) {
        actor.attemptsTo(
                Ensure.that(Text.of(cuenta)).isEqualTo(saldoEsperado)
        );
    }
}