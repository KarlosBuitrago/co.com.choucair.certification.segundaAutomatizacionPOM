package co.com.choucair.certification.segundaAutomatizacionPOM.runners;
//Importaciones de los paquetes y clases necesaria
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

//Etiqueta que permite correr la automatizacionbajo la clase que invoca: CucumberWithSerenity.class
@RunWith(CucumberWithSerenity.class)
//Opciones de Cucumber
@CucumberOptions(
        //pasamos la ruta donde se encuentra alojado el archivo cucumber .feature
        features = "src/test/resources/features/prueba.feature",
        //Se le indica en que etiqueta correr la prueba
        tags = {"@HistoriaDeUsuario"},
        //Se le indica donde estara el codigo que genera cucumber desde el feature
        glue =  "co.com.choucair.certification.segundaAutomatizacionPOM.stepDefinitions",
        //se le indica como generara el codigo para los metodos donde se invocaran las acciones
        //en este caso se le indica que lo haga bajo la sintaxis CamelCaseUp
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {
}
