#Author: equipo 3
#Keywords Summary :
#Feature: List of scenarios.
@tag
Feature: Navegar web
  Yo como visitante quiero mandar curri

  @put1
  Scenario: Entro en la pagina de enviar curri
    Given Pagina web de lucatic
    When Hace click en enviar cv
    Then Nos lleva a la pagina de enviar curri
    
