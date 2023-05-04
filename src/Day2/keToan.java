package Day2;

public class keToan extends nhanVien {
    private String bangCap;
    private String maTruongPhong;

    public keToan(String manhanVien, String tennhanVien) {
        super(manhanVien, tennhanVien);
    }

    public keToan(String manhanVien, String tennhanVien, String ngaySinh, boolean gioiTinh, double luong,
                  String bangCap, String maTruongPhong) {
        super(manhanVien, tennhanVien, ngaySinh, gioiTinh, luong);
        this.bangCap = bangCap;
        this.maTruongPhong = maTruongPhong;
    }

    public String getBangCap() {
        return bangCap;
    }

    public void setBangCap(String bangCap) {
        this.bangCap = bangCap;
    }

    public String getMaTruongPhong() {
        return maTruongPhong;
    }

    public void setMaTruongPhong(String maTruongPhong) {
        this.maTruongPhong = maTruongPhong;
    }
}