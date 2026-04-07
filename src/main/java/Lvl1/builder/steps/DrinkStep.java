package Lvl1.builder.steps;

public interface DrinkStep {
    BuildStep withDrink(String drink);
    BuildStep withoutDrink();
}
