package Facade;

public class RepairShop {
    private RepairGadget smartPhoneRepairer;
    private RepairGadget EarphoneRepairer;
    public RepairShop(){
        smartPhoneRepairer=new SmartPhoneRepairer();
        EarphoneRepairer=new EarphoneRepairer();
    }
    public void repairSmartPhone(SmartPhone smartPhone){
        smartPhoneRepairer.repair(smartPhone);
    }
    public void repairDigitalWatch(Earphone earphone){
        EarphoneRepairer.repair(earphone);
    }
}
