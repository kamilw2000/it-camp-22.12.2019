package pl.camp.it.gui;

import pl.camp.it.db.CarRepository;
import pl.camp.it.model.Bus;
import pl.camp.it.model.Car;
import pl.camp.it.model.Truck;
import pl.camp.it.model.Vehicle;

import java.util.Scanner;

public class Gui {

    //  static CarRepository carRepository = new CarRepository();
    public static void showMainMenu() {       //static rozdziela zycie obiektu od metody,
        printMainMenu();                                       // slowko static udostepnia metode

        switch (readChoose()) {
            case "1":
                showAllVehicles();
                break;
            case "2":
                showAllCars();
                break;
            case "3":
                showAllBuses();
                break;
            case "4":
                showAllTrucks();
                break;
            case "5":
                showRentScreen();
                break;
            case "6":
                System.exit(0);
                break;
            default:
                System.out.println("\n\n\nzla wartosc!");
                showMainMenu();
                break;
        }
        showMainMenu();

    }


    private static void showAllVehicles() {
        Vehicle[] availebleVehicles = CarRepository.getBaza().getAvailableVehicles();
        for (Vehicle availebleVehicle : availebleVehicles) {
            if (availebleVehicle != null) {
                System.out.println(availebleVehicle);
            }
        }
    }

    private static void showAllCars() {
        //CarRepository carRepository = new CarRepository();
        Car[] availebleCars = CarRepository.getBaza().getAvailableCars();
        for (Car car : availebleCars) {
            if (car != null) {
                System.out.println(car);
            }
        }

    }

    private static void showAllBuses() {
        Bus[] availebleBuses = CarRepository.getBaza().getAvailableBuses();
        for (Bus bus : availebleBuses) {
            if (bus != null) {
                System.out.println(bus);
            }
        }

    }

    private static void showAllTrucks() {
        //  CarRepository carRepository = new CarRepository();
        Truck[] availebleTrucks = CarRepository.getBaza().getAvailableTrucks();
        for (Truck truck : availebleTrucks) {
            if (truck != null) {
                System.out.println(truck);
            }
        }

    }

    private static void showRentScreen() {
        System.out.println("wpisz VIN: ");

        Scanner scanner = new Scanner(System.in);
        String vin = scanner.nextLine();

        boolean rentResult = CarRepository.getBaza().rentVehicle(vin);
        if (rentResult) {
            System.out.println("udało sie");
        } else {
            System.out.println("wprowadzono nieprawdziwe daje");
        }
    }






    

    private static void printMainMenu() {
        System.out.println("1. Wyswietl dostepne pojazdy");
        System.out.println("2. Wyswietl dostepne samochodu");
        System.out.println("3. Wyswietl dostepne busy");
        System.out.println("4. Wyswietl dostepne ciężarówki");
        System.out.println("5. Wypożycz pojazd");
        System.out.println("6. Wyjdź");


    }


    private static String readChoose() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

