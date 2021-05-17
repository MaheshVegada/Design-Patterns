package Composite;

public class Test 
{
    public static void main(String[] args)
    {
        Politician pm = new Politician("India","PM");
        Politician cm1 = new Politician("Gujarat","CM");
        Politician cm2 = new Politician("Rajasthan","CM");
        Politician mp1 = new Politician("JND","MP");
        Politician mp2 = new Politician("AHM","MP");
        Politician mp3 = new Politician("JPR","MP");
        
        pm.add(cm1);
        pm.add(cm2);
        cm1.add(mp1);
        cm1.add(mp2);
        cm2.add(mp3);
        
        System.out.println(pm);
        for(Politician cms : pm.getothers()){
            System.out.println("\n"+cms);
            for(Politician mps : cms.getothers()){
               System.out.println(mps); 
            }
        }
    }     
}
