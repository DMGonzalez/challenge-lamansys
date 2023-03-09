# language: es
Característica: Gmail

  @Gmail_001 @run
  Escenario: Gmail - Login Correcto
    Dado Que el usuario ingresa a Gmail
    Y el usuario accede a la pantalla de login
    Cuando El usuario ingresa credenciales correctas
    Entonces El usuario se encuentra en la pagina de inicio

  @Gmail_002 @run
  Escenario: Gmail - Login Incorrecto - Campo 'Password' incorrecto
    Dado Que el usuario ingresa a Gmail
    Y el usuario accede a la pantalla de login
    Cuando El usuario ingresa password incorrecto
    Entonces Se muestra mensaje de error indicando credenciales invalidas

  @Gmail_003 @run
  Escenario: Gmail - Login Incorrecto - Campo 'Email' incorrecto
    Dado Que el usuario ingresa a Gmail
    Y el usuario accede a la pantalla de login
    Cuando El usuario ingresa campo email con usuario incorrecto
    Entonces Se muestra mensaje de error indicando usuario incorrecto de email