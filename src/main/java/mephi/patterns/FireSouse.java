package mephi.patterns;

public class FireSouse extends ModifierDecorator {
    public FireSouse(Eat eat) {
        super(eat);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " +огненный соус";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 10;
    }
}