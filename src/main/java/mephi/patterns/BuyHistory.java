package mephi.patterns;

import java.util.ArrayList;

public class BuyHistory{
    private ArrayList<String> history= new ArrayList<>();

    public void add(String text){
        history.add(text);
    }

    public String getText(){
        return String.join(" ",history);
    }
}
