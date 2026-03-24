package mephi.patterns;

public class DoubleOlenina extends ModifierDecorator{
    public DoubleOlenina(Eat eat){
        super(eat);
    }

    @Override
    public String getDesc(){
        return eat.getDesc()+" +двойная олениена";
    }

    @Override
    public int getPrice(){
        return eat.getPrice()+20;
    }
}