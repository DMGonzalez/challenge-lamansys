# language: es
Característica: Ebay

  @Ebay_001 @run
  Escenario: Ebay - Búsqueda - 'Guitarra electrica'
    Dado Que el usuario ingresa a Ebay
    Cuando El usuario realiza una busqueda 'Guitarra electrica'
    Entonces Muestra el primer resultado de la busqueda