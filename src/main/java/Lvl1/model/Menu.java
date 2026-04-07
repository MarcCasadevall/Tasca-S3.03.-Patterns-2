package Lvl1.model;


public class Menu {

    private String starter;
    private String mainCourse;
    private String dessert;
    private String drink;
    private String extra;
    private boolean isVegan;
    private boolean isCeliac;

    private String type;


    public Menu() {}


    public void setStarter(String starter) { this.starter = starter; }
    public void setMainCourse(String mainCourse) { this.mainCourse = mainCourse; }
    public void setDessert(String dessert) { this.dessert = dessert; }
    public void setDrink(String drink) { this.drink = drink; }
    public void setExtra(String extra) { this.extra = extra; }
    public void setVegan(boolean vegan) { isVegan = vegan; }
    public void setCeliac(boolean celiac) { isCeliac = celiac; }
    public void setType(String type) { this.type = type; }

    @Override
    public String toString() {
        return "Menu [" + type + "]: " +
                (starter != null ? "Starter: " + starter : "") +
                ", Main: " + mainCourse +
                (extra != null ? " (Extra: " + extra + ")" : "") +
                (dessert != null ? ", Dessert/Coffee: " + dessert : "") +
                ", Drink: " + (drink != null ? drink : "None") +
                (isVegan ? " [VEGAN]" : "") +
                (isCeliac ? " [CELIAC]" : "");
    }
}