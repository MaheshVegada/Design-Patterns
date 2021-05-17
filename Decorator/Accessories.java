package Decorator;

public class Accessories implements Mobile {
    protected Mobile mob;
    public Accessories(Mobile mob){
        this.mob=mob;
    }
    
    @Override
    public float cost() {
        return mob.cost();
    }
}
