package mephi.patterns;

public class Berries extends ModifierDecorator{
    public Berries(Eat eat){
        super(eat);
    }

    @Override
    public String getDesc(){
        return eat.getDesc()+" +снежные ягоды";
    }

    @Override
    public int getPrice(){
        return eat.getPrice()+5;
    }
}