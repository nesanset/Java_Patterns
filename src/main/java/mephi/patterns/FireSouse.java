package mephi.patterns;

public class FireSouse extends ModifierDecorator{
    public FireSouse(Eat eat){
        super(eat);
    }

    @Override
    public String getDesc(){
        return eat.getDesc() + " +огненный соус";
    }

    @Override
    public int getPrice(){
        return eat.getPrice() + 10;
    }
}