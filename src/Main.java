import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       student details = new student();
       details.modules();
       //prompt
       System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        System.out.print("please enter your surname:");
        String surname = sc.nextLine();
        System.out.print("Please enter your address:");
        String address = sc.nextLine();
        System.out.print("Please enter your age:");
        int age = sc.nextInt();
        System.out.print("Please enter your id number:");
        int id = sc.nextInt();

        //setting
        details.set_name(name);
        details.set_surname(surname);
        details.set_address(address);
        details.setAge(age);
        details.setId(id);

        //displaying
       System.out.println("Your name is " + details.get_name());
       System.out.println("Your surname is " +details.get_surname());
       System.out.println("Your address is "+ details.get_address());
        System.out.println("Your id number is "+ details.getId());
       System.out.println("Your age is "+ details.getAge());

    }
}