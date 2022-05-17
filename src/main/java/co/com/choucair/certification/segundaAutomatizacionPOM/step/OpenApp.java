package co.com.choucair.certification.segundaAutomatizacionPOM.step;

import co.com.choucair.certification.segundaAutomatizacionPOM.pageObject.PaginaUrl;
import net.thucydides.core.annotations.Step;

public class OpenApp {
    private PaginaUrl paginaUrl;

    @Step
    public void appUrl(){
        paginaUrl.open();
    }
}
