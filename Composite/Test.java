package composite1;

public class Test 
{
    public static void main(String[] args)
    {
        politicians pm = new politicians("India","PM");
        politicians cm1 = new politicians("Gujarat","CM");
        politicians cm2 = new politicians("Rajasthan","CM");
        politicians mp1 = new politicians("JND","MP");
        politicians mp2 = new politicians("AHM","MP");
        politicians mp3 = new politicians("JPR","MP");
        
        pm.add(cm1);
        pm.add(cm2);
        cm1.add(mp1);
        cm1.add(mp2);
        cm2.add(mp3);
        
        System.out.println(pm);
        for(politicians cms : pm.getothers()){
            System.out.println("\n"+cms);
            for(politicians mps : cms.getothers()){
               System.out.println(mps); 
            }
        }
    }     
}
