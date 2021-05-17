package Decorator;

public class Cover extends Accessories {
    public Cover(Mobile mob){
        super(mob);
    }
    @Override
    public float cost(){
        return mob.cost()+20;
    }
}
