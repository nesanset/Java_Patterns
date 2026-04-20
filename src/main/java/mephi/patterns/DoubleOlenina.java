package mephi.patterns;

public class DoubleOlenina extends ModifierDecorator{
    public DoubleOlenina(Eat eat) {
        super(eat);
    }

    @Override
    public String getDesc(){
        return super.getDesc() + " +двойная оленина";
    }

    @Override
    public int getPrice(){
        return super.getPrice() + 20;
    }
}