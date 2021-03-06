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
        System.out.println("Nh???p m?? kh??ch h??ng");
        int code = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < customerServices.size(); i++) {
            if (code == customerServices.get(i).getMaKhachHang()) {
                check = true;
                System.out.println("Nh???p T??n");
                String name = scanner.nextLine();
                System.out.println("Nh???p ng??y sinh");
                int birth = Integer.parseInt(scanner.nextLine());
                System.out.println("Nh???p email");
                String email = scanner.nextLine();
                System.out.println("Nh???p s??? CMND");
                int numberCMND = Integer.parseInt(scanner.nextLine());
                System.out.println("Nh???p s??? ??i???n tho???i");
                int phoneNumber = Integer.parseInt(scanner.nextLine());
                System.out.println("Nh???p gi???i t??nh ");
                String gender = scanner.nextLine();
                System.out.println("Nh???p m?? kh??ch h??ng");
                int maKhachHang=Integer.parseInt(scanner.nextLine());
                System.out.println("Nh???p lo???i kh??ch h??ng");
                String loaiKhachHang = scanner.nextLine();
                System.out.println("Nh???p ?????a ch???");
                String address = scanner.nextLine();
                customerServices.add(new Customer(name,birth,email,numberCMND,phoneNumber,gender,maKhachHang,loaiKhachHang,address));
            }
            if (check) {
                System.out.println("Nh???p l???i M?? Kh??ch H??ng");
            }
            writeFileCustomer();
        }
    }

    @Override
    public void add() {
        System.out.println("Nh???p T??n");
        String name = scanner.nextLine();
        System.out.println("Nh???p ng??y sinh");
        int birth = Integer.parseInt(scanner.nextLine());
        System.out.println("Nh???p email");
        String email = scanner.nextLine();
        System.out.println("Nh???p s??? CMND");
        int numberCMND = Integer.parseInt(scanner.nextLine());
        System.out.println("Nh???p s??? ??i???n tho???i");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nh???p gi???i t??nh ");
        String gender = scanner.nextLine();
        System.out.println("Nh???p M?? Kh??ch H??ng ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.println("Nh???p lo???i kh??ch h??ng");
        String customerType = scanner.nextLine();
        System.out.println("Nh???p ?????a ch???");
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
