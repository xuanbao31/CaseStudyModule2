package Case_Study.Service.Impl;

import Case_Study.Model.Employee;
import Case_Study.Service.EmployeeService;
import Case_Study.Util.WriteAndReadFile;
import FunramaResort.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Employee> arrayList = new ArrayList<>();

    public static void writeFileEmployee() {
        WriteAndReadFile.clearFile("src/Case_Study/Data/Employee.txt");
        for (Employee employee : arrayList) {
            String data = employee.getName() + "," + employee.getBirth() + "," + employee.getEmail() + "," + employee.getNumberCMND() + "," + employee.getPhoneNumber() + "," + employee.getGender() + "," + employee.getCodeNhanVien() + "," + employee.getTrinhDo() + "," + employee.getViTri() + "," + employee.getLuong();
            WriteAndReadFile.writeFile("src/Case_Study/Data/Employee.txt", data);
        }
    }

    public static void readFileEmployee() {
        arrayList.clear();
        List<String> stringList = WriteAndReadFile.readFile("src/Case_Study/Data/Employee.txt");
        for (String s : stringList) {
            String[] strings = s.split(",");
            String name = strings[0];
            int birth = Integer.parseInt(strings[1]);
            String email = strings[2];
            int numberCMND = Integer.parseInt(strings[3]);
            int phoneNumber = Integer.parseInt(strings[4]);
            String gender = strings[5];
            int codeNhanVien = Integer.parseInt(strings[6]);
            String trinhDo = strings[7];
            String viTri = strings[8];
            Double Luong = Double.parseDouble(strings[9]);
            arrayList.add(new Employee(name, birth, email, numberCMND, phoneNumber, gender, codeNhanVien, trinhDo, viTri, Luong));
        }
    }


    @Override
    public void add() {
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        int birth = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        System.out.println("Nhập CMND");
        int numberCMND = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số điện thoại ");
        int numberPhone = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập mã nhân viên");
        int codeNhanVien = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập trình độ");
        String trinhDo = scanner.nextLine();
        System.out.println("Nhập vị trí");
        String viTri = scanner.nextLine();
        System.out.println("Nhập lương");
        double luong = Double.parseDouble(scanner.nextLine());
        arrayList.add(new Employee(name, birth, email, numberCMND, numberPhone, gender, codeNhanVien, trinhDo, viTri, luong));
        writeFileEmployee();
    }

    @Override
    public void edit() {
        readFileEmployee();
        do {
            System.out.println("Nhập mã nhân viên ");
            int maNhanVien = Integer.parseInt(scanner.nextLine());
            boolean check = false;
            for (int i = 0; i < arrayList.size(); i++) {
                if (maNhanVien == arrayList.get(i).getCodeNhanVien()) {
                    check = true;
                    System.out.println("Nhập tên muốn sửa");
                    String name = scanner.nextLine();
                    System.out.println("Nhập ngày sinh muốn sửa");
                    int day = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập email muốn sửa");
                    String email = scanner.nextLine();
                    System.out.println("Nhập số CMND");
                    int numberCMND = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập số điện thoại");
                    int phoneNumber = Integer.parseInt(scanner.nextLine());
                    System.out.println("Giới tính");
                    String gender = scanner.nextLine();
                    System.out.println("Trình độ");
                    String trinhDo = scanner.nextLine();
                    System.out.println("Vị trí");
                    String viTri = scanner.nextLine();
                    System.out.println("Nhập Lương");
                    double luong = Double.parseDouble(scanner.nextLine());
                    int id = arrayList.get(i).getCodeNhanVien();
                    arrayList.remove(arrayList.get(i));
                    arrayList.add(new Employee(name, day, email, numberCMND, phoneNumber, gender, id, trinhDo, viTri, luong));
                    writeFileEmployee();
                    return;
                }
            }
            if (check) {
                System.out.println("Nhập lại mã nhân viên ");
            }

        } while (true);


    }

    @Override
    public void display() {
        readFileEmployee();
        for (Employee employeeService : arrayList) {
            System.out.println(employeeService);
        }
    }


}

