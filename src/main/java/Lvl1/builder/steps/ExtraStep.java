package Lvl1.builder.steps;

public interface ExtraStep {
    DessertOrCoffeeStep withExtra(String garnish);
    DessertOrCoffeeStep noExtra();
}