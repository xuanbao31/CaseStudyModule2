package Case_Study.Model;

public class Employee extends Person {
    private int codeNhanVien;
    private String trinhDo;
    private String viTri;
    private double luong;

    public Employee() {
    }

    public Employee(String name, int birth, String email, int numberCMND, int phoneNumber, String gender, int codeNhanVien, String trinhDo, String viTri, double luong) {
        super(name, birth, email, numberCMND, phoneNumber, gender);
        this.codeNhanVien = codeNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public Employee(int codeNhanVien, String trinhDo, String viTri, double luong) {
        this.codeNhanVien = codeNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public int getCodeNhanVien() {
        return codeNhanVien;
    }

    public void setCodeNhanVien(int codeNhanVien) {
        this.codeNhanVien = codeNhanVien;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return super.toString()+ "Employee{" +
                "codeNhanVien=" + codeNhanVien +
                ", trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }
}
