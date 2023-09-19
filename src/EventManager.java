import java.util.Scanner;

public class EventManager {

    Participent participent1;
    Participent participent2;
    Participent participent3;
    Events event1;

    Participent participent1lp;
    Participent participent2lp;
    Participent participent3lp;
    Events event2;

    public static void main(String[] args) {
        new EventManager().run();
    }

    private void run() {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to Royal Arena!");
        System.out.println("Current events: ");
        System.out.println("1. Metallica  - 21/09/24");
        System.out.println("2. Linkin Park - 11/10/24");
        System.out.println("Choose your poison: (1/2) ");


        int choice = scanner.nextInt();


        if (choice == 1) {
            metallica();
            printEvent1();
        } else if (choice == 2) {
            linkinPark();
            printEvent2();
        } else {
            System.out.println("Invalid choice");
        }
    }


    void metallica() {
        participent1 = new Participent();
        participent1.name = "James Hetfield";
        participent1.age = 60;

        participent2 = new Participent();
        participent2.name = "Kirk Hammett";
        participent2.age = 60;

        participent3 = new Participent();
        participent3.name = "Lars Ulrich";
        participent3.age = 59;

        event1 = new Events();
        event1.band = "Metallica";
        event1.date = "21/09/2024";
        event1.venue = "Royal Arena";
        event1.seatsAvailable = 2500;
    }


    private void printEvent1() {
        System.out.println("Event: " + event1.band);
        System.out.println("Date: " + event1.date);
        System.out.println("Venue: " + event1.venue);
        System.out.println("Seats Available: " + event1.seatsAvailable);
        System.out.println("Participants:");
        System.out.println("1. Name: " + participent1.name + ", Age: " + participent1.age);
        System.out.println("2. Name: " + participent2.name + ", Age: " + participent2.age);
        System.out.println("3. Name: " + participent3.name + ", Age: " + participent3.age);
    }


    void linkinPark() {
        participent1lp = new Participent();
        participent1lp.name = "Mike Shinoda";
        participent1lp.age = 46;

        participent2lp = new Participent();
        participent2lp.name = "Chester Bennington";
        participent2lp.age = 41;

        participent3lp = new Participent();
        participent3lp.name = "Joe Hahn";
        participent3lp.age = 46;

        event2 = new Events();
        event2.band = "Linkin Park";
        event2.date = "11/10/2024";
        event2.venue = "Royal Arena";
        event2.seatsAvailable = 2500;
    }


    void printEvent2() {
        System.out.println("Event: " + event2.band);
        System.out.println("Date: " + event2.date);
        System.out.println("Venue: " + event2.venue);
        System.out.println("Seats Available: " + event2.seatsAvailable);
        System.out.println("Participants:");
        System.out.println("1. Name: " + participent1lp.name + ", Age: " + participent1lp.age);
        System.out.println("2. Name: " + participent2lp.name + ", Age: " + participent2lp.age);
        System.out.println("3. Name: " + participent3lp.name + ", Age: " + participent3lp.age);
    }
}
