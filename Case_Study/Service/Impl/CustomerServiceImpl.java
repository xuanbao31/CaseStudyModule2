package Case_Study.Service.Impl;

import Case_Study.Model.Customer;
import Case_Study.Service.CustomerService;
import Case_Study.Util.WriteAndReadFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Customer> customerServices = new ArrayList<>();

    //    String name, int birth, String email, int numberCMND, int phoneNumber, String gender, int maKhachHang, String loaiKhach, String address
    public static void writeFileCustomer() {
        WriteAndReadFile.clearFile("src/Case_Study/Data/Customer.txt");
        for (Customer customer : customerServices) {
            String data = customer.getName() + "," + customer.getBirth() + "," + customer.getEmail() + "," + customer.getNumberCMND() + "," + customer.getPhoneNumber() + "," + customer.getGender() + "," + customer.getMaKhachHang() + "," + customer.getLoaiKhach() + "," + customer.getAddress();
            WriteAndReadFile.writeFile("src/Case_Study/Data/Customer.txt", data);
        }
    }

    public static void readFileCustomer() {
        customerServices.clear();
        List<String> customerList = WriteAndReadFile.readFile("src/Case_Study/Data/Customer.txt");
        for (String c : customerList) {
            String[] strings = c.split(",");
            String name = strings[0];
            int birth = Integer.parseInt(strings[1]);
            String email = strings[2];
            int numberCMND = Integer.parseInt(strings[3]);
            int phoneNumber = Integer.parseInt(strings[4]);
            String gender = strings[5];
            int maKhachHang = Integer.parseInt(strings[6]);
            String loaiKhachHang = strings[7];
            String address = strings[8];
            customerServices.add(new Customer(name, birth, email, numberCMND, phoneNumber, gender, maKhachHang, loaiKhachHang, address));

        }

    }

    @Override
    public void edit() {
        readFileCustomer();
        System.out.println("Nhập mã khách hàng");
        int code = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < customerServices.size(); i++) {
            if (code == customerServices.get(i).getMaKhachHang()) {
                check = true;
                System.out.println("Nhập Tên");
                String name = scanner.nextLine();
                System.out.println("Nhập ngày sinh");
                int birth = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập email");
                String email = scanner.nextLine();
                System.out.println("Nhập số CMND");
                int numberCMND = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập số điện thoại");
                int phoneNumber = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập giới tính ");
                String gender = scanner.nextLine();
                System.out.println("Nhập mã khách hàng");
                int maKhachHang=Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập loại khách hàng");
                String loaiKhachHang = scanner.nextLine();
                System.out.println("Nhập địa chỉ");
                String address = scanner.nextLine();
                customerServices.add(new Customer(name,birth,email,numberCMND,phoneNumber,gender,maKhachHang,loaiKhachHang,address));
            }
            if (check) {
                System.out.println("Nhập lại Mã Khách Hàng");
            }
            writeFileCustomer();
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập Tên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        int birth = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        System.out.println("Nhập số CMND");
        int numberCMND = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số điện thoại");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính ");
        String gender = scanner.nextLine();
        System.out.println("Nhập Mã Khách Hàng ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập loại khách hàng");
        String customerType = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        customerServices.add(new Customer(name, birth, email, numberCMND, phoneNumber, gender, code, customerType, address));
        writeFileCustomer();

    }

    @Override
    public void display() {
        readFileCustomer();
        for (Customer c : customerServices) {
            System.out.println(c);
        }
    }

}
