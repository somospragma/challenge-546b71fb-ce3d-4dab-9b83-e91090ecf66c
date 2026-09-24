package com.pragma.payments.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.QuestionBuilder;

public class ElSaldoDisponible implements Question<BigDecimal> {
    @Override
    public BigDecimal answeredBy(Actor actor) {
        // Implementar lógica para obtener el saldo disponible
        return null;
    }

    public static QuestionBuilder<BigDecimal> saldoDisponible() {
        return new QuestionBuilder<>();
    }
}