package model;

public class ToyotaCar extends Car {

    private String color = "";
    private int nbDoors = 0;
    private String model = "";

    public ToyotaCar(Pack pack){
        super(pack);
    }

    public ToyotaCar(ToyotaCar target) {
        super(target);
        if(target != null) {
            this.model = target.model;
            this.nbDoors = target.nbDoors;
            this.color = target.color;
        }
    }

    @Override
    public Car clone() {
        return new ToyotaCar(this);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNbDoors(int number) {
        this.nbDoors = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Toyota " + model + " du pack " + pack.getPackName() + " de couleur " + color + " à " + nbDoors + " portes.";
    }

}
