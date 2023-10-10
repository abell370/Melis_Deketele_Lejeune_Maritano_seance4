package model;

public abstract class Car {

    private boolean hasRadio = false;
    private boolean hasPhone = false;
    private boolean hasChildSeat = false;
    private boolean hasMirrors = false;
    private boolean hasSuspensions = false;
    private boolean hasRims = false;
    public Pack pack;


    public Car(Pack pack) {
        this.pack = pack;
        if(pack instanceof FamilyPack) {
            this.hasChildSeat = true;
            this.hasMirrors = true;
        } else if(pack instanceof StandardPack) {
            this.hasRadio = true;
            this.hasPhone = true;
        } else {
            this.hasSuspensions = true;
            this.hasRims = true;
        }

    }

    public Car(Car target) {
        if (target != null) {
            this.hasRadio = target.hasRadio;
            this.hasPhone = target.hasPhone;
            this.hasChildSeat = target.hasChildSeat;
            this.hasMirrors = target.hasMirrors;
            this.hasSuspensions = target.hasSuspensions;
            this.hasRims = target.hasRims;
            this.pack = target.pack;
        }
    }

    public abstract Car clone();

}
