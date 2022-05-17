package co.com.choucair.certification.segundaAutomatizacionPOM.step;

import co.com.choucair.certification.segundaAutomatizacionPOM.pageObject.PaginaUrl;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

public class TaskAction {
    private PaginaUrl paginaUrl;

    @Step
    public void signIn(){
        paginaUrl.user.sendKeys("demo");
        paginaUrl.pass.sendKeys("demo");
        paginaUrl.btn_sign_in.click();
    }

    public void verificar(){
        assertThat(paginaUrl.lbl_Menu.isCurrentlyVisible(), is(true));
    }
}
