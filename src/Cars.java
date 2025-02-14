import java.util.Scanner;

public class Cars extends Showroom implements utility{
    String car_id;
    String car_model;
    String car_color;
    int car_price;
    String car_name;

    public void get_details() {
        System.out.println( "Car ID: " + car_id);
        System.out.println( "Car Model: " + car_model);
        System.out.println( "Car Color: " + car_color);
        System.out.println( "Car Price: " + car_price);
        System.out.println( "Car Name: " + car_name);
        System.out.println(" Showroom Name: "+showroom_name);
    }

    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Car ID");
        car_id = sc.nextLine();
        System.out.println("Enter Car Model");
        car_model = sc.nextLine();
        System.out.println("Enter Car Color");
        car_color = sc.nextLine();
        System.out.println("Enter Car Price");
        car_price = sc.nextInt();
        total_cars_in_showroom++;
    }
}
