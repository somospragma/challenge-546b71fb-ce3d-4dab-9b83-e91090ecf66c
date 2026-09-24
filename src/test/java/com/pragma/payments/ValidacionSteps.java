package com.pragma.payments;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class ValidacionSteps {

    @Given("el usuario con ID {string} existe")
    public void elUsuarioConIDExiste(String usuarioId) {
        // Implementar
    }

    @When("el usuario intenta realizar un pago")
    public void elUsuarioIntentaRealizarUnPago() {
        // Implementar
    }

    @Then("se valida la informacion del usuario")
    public void seValidaLaInformacionDelUsuario() {
        // Implementar
    }

    @Then("el pago es rechazado por informacion invalida")
    public void elPagoEsRechazadoPorInformacionInvalida() {
        // Implementar
    }
}