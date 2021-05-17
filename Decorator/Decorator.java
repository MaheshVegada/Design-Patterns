package Decorator;

public class Decorator {
    public static void main(String[] args) {
        System.out.println("Iphone s Price: "+new Iphone().cost());
        System.out.println("Samsung s Price: "+new Samsung().cost());
        
        Mobile iph = new Iphone();
        Mobile iphScrgrd = new Screenguard(iph);
        System.out.println("Iphone with Screenguard: "+iphScrgrd.cost());
        
        Mobile sam = new Samsung();
        Mobile samCover = new Cover(sam);
        System.out.println("Samsung with cover: "+samCover.cost());
        
        Mobile samCoverGlass = new Glass(samCover);
        System.out.println("Samsung with cover & glass: "+samCoverGlass.cost());
        
        Mobile samCoverGlassScrgrd = new Screenguard(samCoverGlass);
        System.out.println("Samsung with cover, glass & Screenguard: "+samCoverGlassScrgrd.cost());   
    } 
}
