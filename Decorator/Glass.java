package Decorator;

public class Glass extends Accessories{
    public Glass(Mobile mob){
        super(mob);
    }
    @Override
    public float cost(){
        return mob.cost()+10;
    }
}
