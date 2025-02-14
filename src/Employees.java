import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements utility{

    String emp_id;
    String emp_name;
    String emp_department;
    int emp_age;

    public void get_details() {
        System.out.println( "Employee ID: " + emp_id);
        System.out.println( "Employee Name: " + emp_name);
        System.out.println( "Employee Department: " + emp_department);
        System.out.println( "Employee Age: " + emp_age);
        System.out.println(" Showroom Name: "+showroom_name);
    }

    public void set_details() {
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println();
        System.out.println("Enter Employee Name");
        emp_name = sc.nextLine();
        System.out.println("Enter Employee Department");
        emp_department = sc.nextLine();
        System.out.println("Enter Employee Age");
        emp_age = sc.nextInt();
        System.out.println("Enter Showroom Name");
        showroom_name = sc.nextLine();
    }

}
