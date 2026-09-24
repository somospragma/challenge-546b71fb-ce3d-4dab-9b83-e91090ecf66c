package com.pragma.payments.models;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Pago {
    private UUID id;

    @NotNull(message = "El ID del usuario es obligatorio")
    private UUID usuarioId;

    @NotNull(message = "El número de cuenta origen es obligatorio")
    @Pattern(regexp = "^[0-9]{10,20}$", message = "El número de cuenta debe tener entre 10 y 20 dígitos")
    private String cuentaOrigen;

    @NotNull(message = "El número de cuenta destino es obligatorio")
    @Pattern(regexp = "^[0-9]{10,20}$", message = "El número de cuenta debe tener entre 10 y 20 dígitos")
    private String cuentaDestino;

    @NotNull(message = "El monto es obligatorio")
    @DecimalMin(value = "0.01", message = "El monto debe ser mayor que cero")
    private BigDecimal monto;

    @NotBlank(message = "La moneda es obligatoria")
    @Size(min = 3, max = 3, message = "La moneda debe tener exactamente 3 caracteres")
    private String moneda;

    @NotNull(message = "La fecha de creación es obligatoria")
    private LocalDateTime fechaCreacion;

    @NotBlank(message = "El canal es obligatorio")
    private String canal;

    @NotBlank(message = "El ID de idempotencia es obligatorio")
    private String idempotenciaKey;

    // Constructores, getters y setters
    public Pago() {
        this.id = UUID.randomUUID();
        this.fechaCreacion = LocalDateTime.now();
    }

    public Pago(UUID usuarioId, String cuentaOrigen, String cuentaDestino, BigDecimal monto,
                String moneda, String canal, String idempotenciaKey) {
        this();
        this.usuarioId = usuarioId;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.monto = monto;
        this.moneda = moneda;
        this.canal = canal;
        this.idempotenciaKey = idempotenciaKey;
    }

    // Getters y setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(UUID usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(String cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getIdempotenciaKey() {
        return idempotenciaKey;
    }

    public void setIdempotenciaKey(String idempotenciaKey) {
        this.idempotenciaKey = idempotenciaKey;
    }
}