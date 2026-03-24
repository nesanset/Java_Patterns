package mephi.patterns;

public abstract class ModifierDecorator implements Eat{
    protected Eat eat;

    public ModifierDecorator(Eat dish){
        this.eat = dish;
    }
}