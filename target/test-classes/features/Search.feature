Feature: Google Search

Scenario Outline: As a user I want to search in google
  Given que el usuario esta en la pagina de google
  When busca <text>
  Then encontro UCB en la web

  Examples:
  |text|
  |UCB Tarija|
