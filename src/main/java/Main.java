import Lvl1.builder.MenuBuilder;
import Lvl1.model.Menu;


public class Main {
    public static void main(String[] args) {

        Menu full = MenuBuilder.start()
                .fullMenu()
                .withStarter("Ensalada")
                .vegan()
                .continueToMain()
                .withMainCourse("Entrecot")
                .continueToExtra()
                .withExtra("Patatas")
                .withDessert("Helado")
                .withDrink("Cola")
                .build();

        Menu medio = MenuBuilder.start()
                .halfMenu()
                .withMainCourse("Entrecot")
                .continueToExtra()
                .noExtra()
                .withCoffee()
                .withoutDrink()
                .build();

        Menu infantil = MenuBuilder.start()
                .kidsMenu()
                .withMainCourse("Macarrones")
                .continueToExtra()
                .noExtra()
                .withDessert("Helado")
                .withDrink("Agua")
                .build();

        System.out.println("--- PEDIDOS RECIBIDOS ---");
        System.out.println(full);
        System.out.println(medio);
        System.out.println(infantil);
    }
}