package Lvl1.builder.steps;

public interface MainOptionsStep {
    MainOptionsStep vegan();
    MainOptionsStep celiac();

    ExtraStep continueToExtra();
}
