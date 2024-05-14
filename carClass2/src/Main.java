import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car = new Car();


        // user input
        System.out.print("Please enter a company name ");
        String make = sc.nextLine();
        System.out.print("Please enter the model");
        String model = sc.nextLine();
        System.out.print("Please enter the year ");
        int year = sc.nextInt();

        //setting
        car.setMake(make);
        car.setModel(model);
        car.setYear(year);

        // displaying
        car.drive();
        System.out.println("The company name is "+ car.getMake());
        System.out.println("The model is "+ car.getModel());
        System.out.println("The year is "+ car.getYear());

    }
}