package composite1;

import java.util.ArrayList;
import java.util.List;

public class politicians 
{
    private String name;
    private String position;
    private List<politicians> others;

    public politicians(String name, String position) {
        this.name = name;
        this.position = position;
        others = new ArrayList<politicians>();
    }
    public void add(politicians p){
        others.add(p);
    }
    public void remove(politicians p){
        others.remove(p);
    }
    public List<politicians> getothers(){
        return others;
    }
    public String toString(){
        return (position+" : "+name);
    }   
}
