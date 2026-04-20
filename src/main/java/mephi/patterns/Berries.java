package mephi.patterns;

public class Berries extends ModifierDecorator {
    public Berries(Eat eat) {
        super(eat);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " +снежные ягоды";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 5;
    }
}