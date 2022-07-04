package Case_Study.Service.Impl;

import Case_Study.Model.Facility;
import Case_Study.Model.House;
import Case_Study.Model.Room;
import Case_Study.Model.Villa;
import Case_Study.Service.FacilityService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    static Scanner scanner = new Scanner(System.in);
    //    String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String dichVuMienPhi
//    (String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, int soTang)
//    (String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, double dienTichHoBoi, int soTang)
    static List<Room> roomList = new ArrayList<>();
    static List<House> housesList = new ArrayList<>();
    static List<Villa> villaList = new ArrayList<>();
    static {
        housesList.add(new House("Thue nha", 200, 2000, 20, "theo tháng", "sạch sẽ thoáng mát", 5, 1));
        roomList.add(new Room("thue phong", 60, 500, 7, "theo tuan", "tam ho boi", 2));
        villaList.add(new Villa("thue villa", 500, 5000, 30, "theo ngày ", "siêu rộng", 100, 4, 3));
    }

    public void addVilla() {
        System.out.println("Nhập tên dịch vụ");
        String dichVu = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        Double dienTichSuDung = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuê");
        Double chiPhiThue = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng tối đa");
        int soLuongNguoiToiDa = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê");
        String kieuThue = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng");
        String tieuChuanPhong = scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi");
        Double dienTichHoBoi = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số tầng");
        int soTang = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(dichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong, dienTichHoBoi, soTang, id);
        villaList.add(villa);
    }

    public void addRoom() {
        System.out.println("Nhập tên dịch vụ");
        String dichVu = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        Double dienTichSuDung = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuê");
        Double chiPhiThue = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng tối đa");
        int soLuongNguoiToiDa = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê");
        String kieuThue = scanner.nextLine();
        System.out.println("Nhập dịch vụ dịch vụ miễn phí");
        String dichVuMienPhi = scanner.nextLine();
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        Room room = new Room(dichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, dichVuMienPhi, id);
        roomList.add(room);

    }

    public void addHouse() {
        System.out.println("Nhập tên dịch vụ");
        String dichVu = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        Double dienTichSuDung = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuê");
        Double chiPhiThue = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng tối đa");
        int soLuongNguoiToiDa = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê");
        String kieuThue = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng");
        String tieuChuanPhong = scanner.nextLine();
        System.out.println("Nhập số tầng");
        int soTang = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        House house = new House(dichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong, soTang, id);
        housesList.add(house);
    }

    @Override
    public void displayList() {

    }

    @Override
    public void display() {
        for (Facility vl : villaList) {
            System.out.println(vl);
        }
        for (Facility h : housesList) {
            System.out.println(h);
        }
        for (Facility r : roomList) {
            System.out.println(r);
        }

    }

    public void edit() {
        do {
            System.out.println("Bạn muốn cập nhật");
            System.out.println("Nhập id");
            int choose = Integer.parseInt(scanner.nextLine());
            for (Villa villa : villaList) {
                if (choose == villa.getId()) {
                    System.out.println("Nhập tên dịch vụ");
                    String dichVu = scanner.nextLine();
                    System.out.println("Nhập diện tích sử dụng");
                    Double dienTichSuDung = Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhập chi phí thuê");
                    Double chiPhiThue = Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhập số lượng tối đa");
                    int soLuongNguoiToiDa = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập kiểu thuê");
                    String kieuThue = scanner.nextLine();
                    System.out.println("Nhập tiêu chuẩn phòng");
                    String tieuChuanPhong = scanner.nextLine();
                    System.out.println("Nhập diện tích hồ bơi");
                    Double dienTichHoBoi = Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhập số tầng");
                    int soTang = Integer.parseInt(scanner.nextLine());
                    Villa villa2 = new Villa(dichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong,dienTichHoBoi,soTang,choose);
                    villaList.add(villa2);
                    villaList.remove(villa);
                }
            }
            for (House house : housesList) {
                if (choose == house.getId()) {
                    System.out.println("Nhập tên dịch vụ");
                    String dichVu = scanner.nextLine();
                    System.out.println("Nhập diện tích sử dụng");
                    Double dienTichSuDung = Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhập chi phí thuê");
                    Double chiPhiThue = Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhập số lượng tối đa");
                    int soLuongNguoiToiDa = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập kiểu thuê");
                    String kieuThue = scanner.nextLine();
                    System.out.println("Nhập tiêu chuẩn phòng");
                    String tieuChuanPhong = scanner.nextLine();
                    System.out.println("Nhập số tầng");
                    int soTang = Integer.parseInt(scanner.nextLine());

                    House house2 = new House(dichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong, soTang,choose);
                    housesList.add(house2);
                    housesList.remove(house);
                }
            }
            for (Room room : roomList) {
                if (choose == room.getId()) {
                    System.out.println("Nhập tên dịch vụ");
                    String dichVu = scanner.nextLine();
                    System.out.println("Nhập diện tích sử dụng");
                    Double dienTichSuDung = Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhập chi phí thuê");
                    Double chiPhiThue = Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhập số lượng tối đa");
                    int soLuongNguoiToiDa = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập kiểu thuê");
                    String kieuThue = scanner.nextLine();
                    System.out.println("Nhập dịch vụ dịch vụ miễn phí");
                    String dichVuMienPhi = scanner.nextLine();
                    Room room2 = new Room(dichVu,dienTichSuDung,chiPhiThue,soLuongNguoiToiDa,kieuThue,dichVuMienPhi,choose);
                    roomList.add(room2);
                    roomList.remove(room);
                }

            }
        } while (true);
    }

    @Override
    public void add() {
        do {
            System.out.println("Bạn muốn thêm mới");
            System.out.println("1.Villa");
            System.out.println("2.House");
            System.out.println("3.Room");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    addVilla();
                    return;
                case "2":
                    addHouse();
                    return;
                case "3":
                    addRoom();
                    return;
                default:
                    System.out.println("Nhập lại số");
                    choose = scanner.nextLine();
            }

        } while (true);

    }

    public void editHouse() {
        int id = Integer.parseInt(scanner.nextLine());
        for (House house : housesList) {
            if (id == house.getId()) {
                System.out.println("Nhập tên dịch vụ");
                String dichVu = scanner.nextLine();
                System.out.println("Nhập diện tích sử dụng");
                Double dienTichSuDung = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập chi phí thuê");
                Double chiPhiThue = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập số lượng tối đa");
                int soLuongNguoiToiDa = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập kiểu thuê");
                String kieuThue = scanner.nextLine();
                System.out.println("Nhập tiêu chuẩn phòng");
                String tieuChuanPhong = scanner.nextLine();
                System.out.println("Nhập số tầng");
                int soTang = Integer.parseInt(scanner.nextLine());
                House house2 = new House(dichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong, soTang, id);
                housesList.add(house2);
                housesList.remove(house);
            }
        }
    }

    public void editVilla() {
        int id = Integer.parseInt(scanner.nextLine());
        for (Villa villa : villaList) {
            if (id == villa.getId()) {
                System.out.println("Nhập tên dịch vụ");
                String dichVu = scanner.nextLine();
                System.out.println("Nhập diện tích sử dụng");
                Double dienTichSuDung = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập chi phí thuê");
                Double chiPhiThue = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập số lượng tối đa");
                int soLuongNguoiToiDa = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập kiểu thuê");
                String kieuThue = scanner.nextLine();
                System.out.println("Nhập tiêu chuẩn phòng");
                String tieuChuanPhong = scanner.nextLine();
                System.out.println("Nhập diện tích hồ bơi");
                Double dienTichHoBoi = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập số tầng");
                int soTang = Integer.parseInt(scanner.nextLine());
                Villa villa2 = new Villa();
                villaList.add(villa2);
                villaList.remove(villa);
            }

        }

    }

    public void editRoom() {
        int id = Integer.parseInt(scanner.nextLine());
        for (Room room : roomList) {
            if (id == room.getId()) {
                System.out.println("Nhập tên dịch vụ");
                String dichVu = scanner.nextLine();
                System.out.println("Nhập diện tích sử dụng");
                Double dienTichSuDung = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập chi phí thuê");
                Double chiPhiThue = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập số lượng tối đa");
                int soLuongNguoiToiDa = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập kiểu thuê");
                String kieuThue = scanner.nextLine();
                System.out.println("Nhập dịch vụ dịch vụ miễn phí");
                String dichVuMienPhi = scanner.nextLine();
                Room room2 = new Room();
                roomList.add(room2);
                roomList.remove(room);

            }
        }
    }
}