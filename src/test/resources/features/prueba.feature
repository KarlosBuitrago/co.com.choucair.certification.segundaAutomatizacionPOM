#Autor

    @HistoriaDeUsuario
    Feature: Verify login session for www.xyz.com platform
        Me as a user WANT to enter the www.xyz.com page TO verify if I can access it correctly

        @CasoAutenticacionCorrecta
        Scenario: Verify correct entry
            Given I enter with may credentials
            When I proceed with the authentication
            Then go to the main view of the page