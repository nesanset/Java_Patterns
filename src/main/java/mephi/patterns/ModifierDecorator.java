package mephi.patterns;

public abstract class ModifierDecorator implements Eat {
    private Eat eat;

    public ModifierDecorator(Eat dish){
        this.eat = dish;
    }

    @Override
    public String getDesc(){
        return eat.getDesc();
    }

    @Override
    public int getPrice(){
        return eat.getPrice();
    }
}