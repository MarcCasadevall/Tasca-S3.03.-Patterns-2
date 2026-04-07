package Lvl1.builder;

import Lvl1.builder.steps.*;
import Lvl1.model.Menu;

public class MenuBuilder implements
        MenuTypeStep, StarterStep, MainCourseStep,
        MainOptionsStep, StarterOptionsStep, ExtraStep,
        DessertOrCoffeeStep, DrinkStep, BuildStep {

    private final Menu menu = new Menu();

    public static MenuTypeStep start() {
        return new MenuBuilder();
    }

    @Override public StarterStep fullMenu() {
        this.menu.setType("Menú Completo");
        return this;
    }

    @Override public MainCourseStep halfMenu() {
        this.menu.setType("Medio Menú");
        return this;
    }

    @Override public MainCourseStep kidsMenu() {
        this.menu.setType("Menú Infantil");
        return this;
    }

    @Override public StarterOptionsStep withStarter(String nombreEntrante) {
        this.menu.setStarter(nombreEntrante);
        return this;
    }

    @Override public MainOptionsStep withMainCourse(String nombrePlatoPrincipal) {
        this.menu.setMainCourse(nombrePlatoPrincipal);
        return this;
    }

    @Override public MenuBuilder vegan() {
        this.menu.setVegan(true);
        return this;
    }

    @Override public MenuBuilder celiac() {
        this.menu.setCeliac(true);
        return this;
    }

    @Override public MainCourseStep continueToMain() {
        return this;
    }

    @Override public ExtraStep continueToExtra() {
        return this;
    }


    @Override public DessertOrCoffeeStep withExtra(String nombreGuarnicion) {
        this.menu.setExtra(nombreGuarnicion);
        return this;
    }

    @Override public DessertOrCoffeeStep noExtra() {
        return this;
    }

    @Override public DrinkStep withDessert(String nombrePostre) {
        this.menu.setDessert(nombrePostre);
        return this;
    }

    @Override public DrinkStep withCoffee() {
        this.menu.setDessert("Café");
        return this;
    }

    @Override public DrinkStep nothing() {
        return this;
    }

    @Override public BuildStep withDrink(String nombreBebida) {
        this.menu.setDrink(nombreBebida);
        return this;
    }

    @Override public BuildStep withoutDrink() {
        return this;
    }

    @Override public Menu build() {
        return this.menu;
    }
}