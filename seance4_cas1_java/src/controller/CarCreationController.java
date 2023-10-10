package controller;

import model.FamilyPack;
import model.SportPack;
import model.StandardPack;
import model.ToyotaCar;
import java.util.Scanner;

public class CarCreationController {

    private Scanner scanner = new Scanner(System.in);
    private ToyotaCar standard = new ToyotaCar(new StandardPack());
    private ToyotaCar sport = new ToyotaCar(new SportPack());
    private ToyotaCar familial = new ToyotaCar(new FamilyPack());
    private ToyotaCar currentCar;

    public CarCreationController() {}

    public void createNewCar() {
        choosePack();
        askInformations();
        System.out.println(currentCar.toString());
    }

    private void choosePack() {
        System.out.print("Quel pack choisissez-vous ?\n1. Standard\n2. Familial\n3. Sport\nVotre choix: ");
        int choice = scanner.nextInt();
        switch(choice) {
            case 1:
                currentCar = (ToyotaCar) standard.clone();
                break;
            case 2:
                currentCar = (ToyotaCar) familial.clone();
                break;
            case 3:
                currentCar = (ToyotaCar) sport.clone();
                break;
        }
    }

    private void askInformations() {
        System.out.print("Modèle : ");
        String model = scanner.next();
        currentCar.setModel(model);
        System.out.print("Couleur : ");
        String color = scanner.next();
        currentCar.setColor(color);
        System.out.print("Nombre de portes : ");
        int nb = scanner.nextInt();
        currentCar.setNbDoors(nb);
    }
}
