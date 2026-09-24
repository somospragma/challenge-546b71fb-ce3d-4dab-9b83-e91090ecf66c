package com.pragma.payments;


import com.pragma.payments.infrastructure.PagoRepository;
import com.pragma.payments.domain.PagoService;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

@ExtendWith(SerenityJUnit5Extension.class)
public class PagoServiceTest {

    @Mock
    private PagoRepository pagoRepository;

    @InjectMocks
    private PagoService pagoService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void realizarPagoTest() {
        // Implementar lógica de prueba para realizarPago
    }

    @Test
    public void consultarSaldoTest() {
        // Implementar lógica de prueba para consultarSaldo
    }

    @Test
    public void existePagoPorIdempotenciaTest() {
        // Implementar lógica de prueba para existePagoPorIdempotencia
    }
}