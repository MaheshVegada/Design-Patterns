package Facade;

public class Test {
    public static void main(String[] args) {
        RepairShop repairShop=new RepairShop();
        SmartPhone sp1=new SmartPhone();
        sp1.setName("POCO M2 PRO");
        sp1.setStatus("Working");
        Earphone dw1=new Earphone();
        dw1.setName("One Plus Z");
        dw1.setStatus("Working");
        System.out.println("Using devices");
        System.out.println("Device's Status:");
        System.out.println(sp1.getName()+" is "+sp1.getStatus());
        System.out.println(dw1.getName()+" is "+dw1.getStatus());
        System.out.println("Devices got problem");
        sp1.setStatus("Not Working");
        dw1.setStatus("Not Working");
        System.out.println("Device's Status:");
        System.out.println(sp1.getName()+" is "+sp1.getStatus());
        System.out.println(dw1.getName()+" is "+dw1.getStatus());
        System.out.println("Devices sent for repairing");
        repairShop.repairSmartPhone(sp1);
        repairShop.repairDigitalWatch(dw1);
        System.out.println("Device's Status after repairing");
        System.out.println(sp1.getName()+" is "+sp1.getStatus());
        System.out.println(dw1.getName()+" is "+dw1.getStatus());
    }
}
