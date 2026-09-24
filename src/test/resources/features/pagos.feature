Feature: Procesamiento de Pagos

  Scenario: Pago exitoso a través de la web
    Given el usuario ha iniciado sesión
    When realiza un pago de 100 USD desde su cuenta de ahorros
    Then el pago se procesa correctamente

  Scenario: Pago fallido por saldo insuficiente
    Given el usuario ha iniciado sesión
    When intenta realizar un pago de 1000 USD desde su cuenta de ahorros con solo 500 USD
    Then se muestra un mensaje de saldo insuficiente

  Scenario: Pago idempotente a través de la API
    Given el usuario ha iniciado sesión
    When realiza un pago de 50 USD a través de la API con la misma clave de idempotencia
    Then solo se procesa un pago