package Case_Study.Model;

public class Room extends Facility {
    private String dichVuMienPhi;

    public Room(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String dichVuMienPhi,int id) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue,id);
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public Room(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public Room() {
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString()+
                "dichVuMienPhi='" + dichVuMienPhi + '\'' +
                '}';
    }
}
