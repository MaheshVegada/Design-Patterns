package Facade;

public class SmartPhoneRepairer implements RepairGadget{
    @Override
    public void repair(Gadget gadget) {
        SmartPhone smartPhone=(SmartPhone)gadget;
        System.out.println("Repairing your "+smartPhone.getName());
        smartPhone.setStatus("Working");
        System.out.println("Your "+smartPhone.getName()+" now working");
    }
}
