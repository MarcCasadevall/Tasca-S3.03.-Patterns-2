package Lvl1.builder.steps;

public interface DessertOrCoffeeStep {
    DrinkStep withDessert(String dessert);
    DrinkStep withCoffee();
    DrinkStep nothing();
}