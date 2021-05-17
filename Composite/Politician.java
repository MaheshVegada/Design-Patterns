package Composite;

import java.util.ArrayList;
import java.util.List;

public class Politician 
{
    private String name;
    private String position;
    private List<Politician> others;

    public Politician(String name, String position) {
        this.name = name;
        this.position = position;
        others = new ArrayList<Politician>();
    }
    public void add(Politician p){
        others.add(p);
    }
    public void remove(Politician p){
        others.remove(p);
    }
    public List<Politician> getothers(){
        return others;
    }
    public String toString(){
        return (position+" : "+name);
    }   
}
