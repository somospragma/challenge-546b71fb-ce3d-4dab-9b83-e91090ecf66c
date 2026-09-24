package com.pragma.payments;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class IdempotenciaSteps {

    @Given("un pago con clave de idempotencia {string} existe")
    public void unPagoConClaveDeIdempotenciaExiste(String idempotenciaKey) {
        // Implementar
    }

    @When("el usuario intenta realizar el mismo pago")
    public void elUsuarioIntentaRealizarElMismoPago() {
        // Implementar
    }

    @Then("el pago no se duplica")
    public void elPagoNoSeDuplica() {
        // Implementar
    }
}