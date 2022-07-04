package Case_Study.Model;

public class Customer extends Person {
    private int maKhachHang;
    private String loaiKhach;
    private String address;

    public Customer() {
    }

    public Customer(String name, int birth, String email, int numberCMND, int phoneNumber, String gender, int maKhachHang, String loaiKhach, String address) {
        super(name, birth, email, numberCMND, phoneNumber, gender);
        this.maKhachHang = maKhachHang;
        this.loaiKhach = loaiKhach;
        this.address = address;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString()+
                "maKhachHang=" + maKhachHang +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
