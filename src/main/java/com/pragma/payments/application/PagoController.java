package com.pragma.payments.application;

import com.pragma.payments.domain.PagoService;
import com.pragma.payments.models.Pago;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pagos")
public class PagoController {

    private final PagoService pagoService;

    @Autowired
    public PagoController(PagoService pagoService) {
        this.pagoService = pagoService;
    }

    @PostMapping
    public ResponseEntity<Pago> realizarPago(@Valid @RequestBody Pago pago) {
        Pago pagoRealizado = pagoService.realizarPago(pago);
        return new ResponseEntity<>(pagoRealizado, HttpStatus.CREATED);
    }

    @GetMapping("/saldo/{cuentaId}")
    public ResponseEntity<BigDecimal> consultarSaldo(@PathVariable String cuentaId) {
        BigDecimal saldo = pagoService.consultarSaldo(cuentaId);
        return new ResponseEntity<>(saldo, HttpStatus.OK);
    }

    @GetMapping("/idempotencia/{idempotenciaKey}")
    public ResponseEntity<Boolean> existePagoPorIdempotencia(@PathVariable String idempotenciaKey) {
        boolean existe = pagoService.existePagoPorIdempotencia(idempotenciaKey);
        return new ResponseEntity<>(existe, HttpStatus.OK);
    }
}