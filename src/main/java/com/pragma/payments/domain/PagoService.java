package com.pragma.payments.domain;


import com.pragma.payments.infrastructure.IdempotenciaException;
import com.pragma.payments.models.Pago;
import java.util.UUID;

public interface PagoService {
    /**
     * Realiza un pago con la información proporcionada.
     * @param pago La solicitud de pago con todos los datos requeridos.
     * @return El pago procesado con su ID generado.
     * @throws SaldoInsuficienteException Si el saldo disponible no es suficiente.
     * @throws ValidacionException Si los datos del pago no son válidos.
     * @throws IdempotenciaException Si ya existe un pago con la misma clave de idempotencia.
     */
    Pago realizarPago(Pago pago) throws SaldoInsuficienteException, ValidacionException, IdempotenciaException;

    /**
     * Consulta el saldo disponible para una cuenta específica.
     * @param cuentaId El ID de la cuenta a consultar.
     * @return El saldo disponible en la cuenta.
     * @throws CuentaNoEncontradaException Si la cuenta no existe.
     */
    BigDecimal consultarSaldo(String cuentaId) throws CuentaNoEncontradaException;

    /**
     * Verifica si ya existe un pago con la misma clave de idempotencia.
     * @param idempotenciaKey La clave de idempotencia a verificar.
     * @return true si ya existe un pago con esa clave, false en caso contrario.
     */
    boolean existePagoPorIdempotencia(String idempotenciaKey);
}