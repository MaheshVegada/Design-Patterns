package Facade;

public class EarphoneRepairer implements RepairGadget{
    @Override
    public void repair(Gadget gadget) {
        Earphone earphone=(Earphone)gadget;
        System.out.println("Repairing your "+earphone.getName());
        earphone.setStatus("Working");
        System.out.println("Your "+earphone.getName()+" now working");
    }
}
