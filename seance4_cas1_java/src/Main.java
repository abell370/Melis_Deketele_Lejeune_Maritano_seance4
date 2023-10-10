import controller.CarCreationController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans votre configurateur TOYOTA !");
        do {
            CarCreationController controller = new CarCreationController();
            System.out.print("MENU\n1. Créer nouveau véhicule\n2.Quitter\nVotre choix : ");
            choice = scanner.nextInt();
            if(choice == 1)
                controller.createNewCar();
        }while(choice != 2);
    }
}
