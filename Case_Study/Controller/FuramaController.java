package Case_Study.Controller;

import Case_Study.Model.Facility;
import Case_Study.Service.Impl.CustomerServiceImpl;
import Case_Study.Service.Impl.EmployeeServiceImpl;
import Case_Study.Service.Impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("Chức năng trên menu: " +
                    "\n 1. Employee Management" +
                    "\n 2. Customer Management" +
                    "\n 3. Facility Management" +
                    "\n 4. Booking Management" +
                    "\n 5. Promotion Management" +
                    "\n 6. Exit");
            System.out.println("Chọn chức năng ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    displayEmployeeManagementMenu();
                    break;
                case "2":
                    displayCustomerManagementMenu();
                    break;
                case "3":
                    displayFacilityManagementMenu();
                    break;
                case "4":
                    displayBookingManagement();
                    break;
                case "5":
                    displayPromotionManagement();
                    break;
            }

        }
    }

    public static void displayEmployeeManagementMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("1. Display list employees" +
                    "\n 2. Add new employee" +
                    "\n 3. Edit employee" +
                    "\n 4. Return main menu");
            String number = scanner.nextLine();
            switch (number) {
                case "1":
                    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
                    employeeService.display();
                    break;
                case "2":
                    EmployeeServiceImpl employeeService1 = new EmployeeServiceImpl();
                    employeeService1.add();
                    break;
                case "3":
                    EmployeeServiceImpl employeeService2 = new EmployeeServiceImpl();
                    employeeService2.edit();
                    break;
                case "4":
                    displayMainMenu();

            }
        }
    }

    public static void displayCustomerManagementMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers" +
                    "\n 2. Add new customer" +
                    "\n 3. Edit customer" +
                    "\n 4. Return main menu");

            String number = scanner.nextLine();
            switch (number) {
                case "1":
                    CustomerServiceImpl customerService = new CustomerServiceImpl();
                    customerService.display();
                    break;
                case "2":
                    CustomerServiceImpl customerService1 = new CustomerServiceImpl();
                    customerService1.add();
                    break;
                case "3":
                    CustomerServiceImpl customerService2 = new CustomerServiceImpl();
                    customerService2.edit();
                    break;
                case "4":
                    displayMainMenu();

            }
        }
    }

    public static void displayFacilityManagementMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("1. Display list facility" +
                    "\n 2. Add new customer" +
                    "\n 3. Edit customer" +
                    "\n 4. Return main menu");

            String number = scanner.nextLine();
            switch (number) {
                case "1":
                    FacilityServiceImpl facilityService1 = new FacilityServiceImpl();
                    facilityService1.display();
                    break;
                case "2":
                    FacilityServiceImpl facilityService2 = new FacilityServiceImpl();
                    facilityService2.add();
                    break;
                case "3":
                    FacilityServiceImpl facilityService3 = new FacilityServiceImpl();
                    facilityService3.edit();
                    break;
                case "4":
                    displayMainMenu();
            }
        }
    }

    public static void displayBookingManagement() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (true) {
            System.out.println("1. Add new booking" +
                    "\n 2. Display list booking" +
                    "\n 3. Create new contracts" +
                    "\n 4. Display list contracts" +
                    "\n 5. Edit contracts" +
                    "\n 6. Return main menu");
        }
    }

    public static void displayPromotionManagement() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (true) {
            System.out.println("1. Display list customers use service" +
                    "\n 2. Display list customers get voucher" +
                    "\n 3. Return main menu");
        }
    }
}
