Feature: Login y validación de titulo

  @test1
  Scenario: Login exitoso y validación de título

    Given que me encuentro en el login de SwagLabs
    When inicio sesión exitosamente con las credenciales usuario "standard_user" y contraseña "secret_sauce"
    Then muestra el título "PRODUCTS"
    And existe al menos un item