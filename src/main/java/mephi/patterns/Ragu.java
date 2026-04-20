package mephi.patterns;

public class Ragu implements Eat{
    @Override
    public String getDesc(){
        return "Нордское рагу";
    }

    @Override
    public int getPrice(){
        return 50;
    }
}