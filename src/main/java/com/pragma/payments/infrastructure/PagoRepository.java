package com.pragma.payments.infrastructure;

import com.pragma.payments.models.Pago;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class PagoRepository {
    private final Map<UUID, Pago> pagosStorage = new ConcurrentHashMap<>();
    private final Map<String, BigDecimal> saldos = new HashMap<>();
    private final Map<String, String> idempotenciaKeys = new ConcurrentHashMap<>();

    public PagoRepository() {
        // Inicializar saldos de prueba
        saldos.put("1234567890", new BigDecimal("1000.00"));
        saldos.put("0987654321", new BigDecimal("500.00"));
    }

    public Pago guardarPago(Pago pago) {
        if (idempotenciaKeys.containsKey(pago.getIdempotenciaKey())) {
            throw new IdempotenciaException("Ya existe un pago con la misma clave de idempotencia");
        }

        pagosStorage.put(pago.getId(), pago);
        idempotenciaKeys.put(pago.getIdempotenciaKey(), pago.getId().toString());
        return pago;
    }

    public boolean existePagoPorIdempotencia(String idempotenciaKey) {
        return idempotenciaKeys.containsKey(idempotenciaKey);
    }

    public BigDecimal consultarSaldo(String cuentaId) {
        return saldos.getOrDefault(cuentaId, BigDecimal.ZERO);
    }

    public void actualizarSaldo(String cuentaId, BigDecimal nuevoSaldo) {
        saldos.put(cuentaId, nuevoSaldo);
    }

    public Pago buscarPagoPorId(UUID pagoId) {
        return pagosStorage.get(pagoId);
    }

    public static class IdempotenciaException extends RuntimeException {
        public IdempotenciaException(String message) {
            super(message);
        }
    }
}