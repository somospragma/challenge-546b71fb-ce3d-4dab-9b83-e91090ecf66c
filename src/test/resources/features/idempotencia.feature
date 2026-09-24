Feature: Validación de Idempotencia en Transacciones

  Scenario: Pago idempotente desde múltiples canales
    Given el usuario ha iniciado sesión
    When realiza un pago de 50 USD desde la web y luego desde la aplicación móvil con la misma clave de idempotencia
    Then solo se procesa un pago

  Scenario: Pago no idempotente
    Given el usuario ha iniciado sesión
    When realiza dos pagos consecutivos de 50 USD desde la web con claves de idempotencia diferentes
    Then se procesan ambos pagos