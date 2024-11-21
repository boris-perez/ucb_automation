Feature: Turno

  Scenario: As a user I want to choose the create turno option
    Given el usuario esta en la pagina de turno
    When el usuario selecciona el boton de Crear Turno
    Then el input para introducir el nombre esta visible

  Scenario: As a user crea el turno Sabado
    And ingresa el nombre del turno Sabado
    When el usuario selecciona el boton de Crear Turno
#    Then el turno esta presente en la lista de turnos


