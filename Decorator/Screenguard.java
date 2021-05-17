package Decorator;

public class Screenguard extends Accessories{
    public Screenguard(Mobile mob){
        super(mob);
    }
    @Override
    public float cost(){
        return mob.cost()+30;
    }
}
