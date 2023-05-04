package Day2;



public class IT extends nhanVien {
    private String moTaCongViec;

    public IT(String maNhanVien, String tenNhanVien) {
        super(maNhanVien, tenNhanVien);
    }

    public IT(String maNhanVien, String tenNhanVien, String ngaySinh, boolean gioiTinh, double luong, String moTaCongViec) {
        super(maNhanVien, tenNhanVien, ngaySinh, gioiTinh, luong);
        this.moTaCongViec = moTaCongViec;
    }

    public String getMoTaCongViec() {
        return moTaCongViec;
    }

    public void setMoTaCongViec(String moTaCongViec) {
        this.moTaCongViec = moTaCongViec;
    }
}