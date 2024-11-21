Feature: Google Search

Scenario Outline: As a user I want to search in google
  Given que el usuario esta en la pagina de google
  When busca <text>


  Examples:
    | text           |
    | UCB Tarija     |
    | UCB Cochabamba |
    | UCB Santa Cruz |
    | UCB La Paz |
