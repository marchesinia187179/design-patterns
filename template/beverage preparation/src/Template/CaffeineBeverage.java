package Template;

public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void boilWater();

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("Boiling water");
    }

    private void addCondiments() {
        System.out.println("Pouring into cup");
    }
}
