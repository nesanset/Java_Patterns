package mephi.patterns;

public class NordBread extends ModifierDecorator{
    public NordBread(Eat eat){
        super(eat);
    }

    @Override
    public String getDesc(){
        return eat.getDesc()+" +нордская лепёшка";
    }

    @Override
    public int getPrice(){
        return eat.getPrice()+7;
    }
}