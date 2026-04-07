package builder;

import Lvl1.builder.MenuBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuBuilderTest {

    @Test
    @DisplayName("Debería crear un menú completo con opciones veganas y celíacas")
    void testMenuCompletoOpcionesDieteticas() {
        Lvl1.model.Menu menu = MenuBuilder.start()
                .fullMenu()
                .withStarter("Ensalada")
                .vegan()
                .celiac()
                .continueToMain()
                .withMainCourse("Arroz")
                .continueToExtra()
                .noExtra()
                .withDessert("Fruta")
                .withDrink("Agua")
                .build();

        // Verificamos que el toString contiene las marcas dietéticas
        String resultado = menu.toString();
        assertTrue(resultado.contains("[VEGAN]"), "El menú debería marcarse como vegano");
        assertTrue(resultado.contains("[CELIAC]"), "El menú debería marcarse como celíaco");
        assertTrue(resultado.contains("Starter: Ensalada"), "El entrante no coincide");
    }

    @Test
    @DisplayName("Debería permitir elegir café en lugar de postre correctamente")
    void testRestriccionPostreOCafe() {
        Lvl1.model.Menu menuConCafe = MenuBuilder.start()
                .halfMenu()
                .withMainCourse("Pollo")
                .continueToExtra()
                .noExtra()
                .withCoffee() // Aquí probamos la rama del café
                .withoutDrink()
                .build();

        String resultado = menuConCafe.toString();

        // Verificamos que aparece "Café" en el campo asignado a postre/café
        assertTrue(resultado.contains("Dessert/Coffee: Café"), "Debería mostrar Café en la sección de postres");
        assertFalse(resultado.contains("Starter:"), "Un medio menú no debería tener entrante");
    }

    @Test
    @DisplayName("Debería funcionar el menú infantil saltando el entrante")
    void testMenuInfantilFlujo() {
        Lvl1.model.Menu menuInfantil = MenuBuilder.start()
                .kidsMenu()
                .withMainCourse("Macarrones")
                .continueToExtra()
                .withExtra("Queso")
                .nothing() // No quiere postre ni café
                .withDrink("Zumo")
                .build();

        assertNotNull(menuInfantil, "El menú no debería ser nulo");
        assertTrue(menuInfantil.toString().contains("Main: Macarrones"), "El plato principal debería ser Macarrones");
        assertTrue(menuInfantil.toString().contains("Extra: Queso"), "Debería incluir el suplemento");
    }
}