package Lvl1.builder.steps;

public interface StarterOptionsStep  {
    StarterOptionsStep vegan();
    StarterOptionsStep celiac();

    MainCourseStep continueToMain();
}
