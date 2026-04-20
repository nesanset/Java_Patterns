package mephi.patterns;

public class NordBread extends ModifierDecorator{
    public NordBread(Eat eat){
        super(eat);
    }

    @Override
    public String getDesc(){
        return super.getDesc() + " +нордская лепёшка";
    }

    @Override
    public int getPrice(){
        return super.getPrice() + 7;
    }
}