Feature: Validación de Información de Usuario

  Scenario: Usuario con información válida
    Given el usuario ha proporcionado información de pago válida
    When se valida la información del usuario
    Then la información se considera válida

  Scenario: Usuario con información inválida
    Given el usuario ha proporcionado información de pago inválida
    When se valida la información del usuario
    Then se muestra un mensaje de error