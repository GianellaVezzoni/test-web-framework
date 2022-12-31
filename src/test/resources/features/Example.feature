Feature: Search product on mercadoLibre webpage
  @Test @Smoke
    Scenario Outline: Search post on mercadoLibre
      Given the user is on MercadoLibre page
      When the user search for the word "<searchWord>"
      Then the user watch the results
    Examples:
      | searchWord  |
      | smartphones |
      | decorations |