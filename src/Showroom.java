import java.util.Scanner;

public class Showroom implements utility{

    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_cars_in_showroom=0;
    String manager_name;
    @Override
    public void get_details() {
        System.out.println( "Showroom Name: " + showroom_name);
        System.out.println( "Showroom Address: " + showroom_address);
        System.out.println( "Total Employees: " + total_employees);
        System.out.println( "Total Cars in Showroom: " + total_cars_in_showroom);
        System.out.println( "Manager Name: " + manager_name);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Showroom Name");
        showroom_name = sc.nextLine();
        System.out.println("Enter Showroom Address");
        showroom_address = sc.nextLine();
        System.out.println("Enter Total Employees");
        total_employees = sc.nextInt();
        System.out.println("Enter Manager Name");
        manager_name = sc.nextLine();
    }
}
