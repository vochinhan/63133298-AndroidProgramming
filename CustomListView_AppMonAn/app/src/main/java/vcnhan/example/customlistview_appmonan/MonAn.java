package vcnhan.example.customlistview_appmonan;

public class MonAn {
    private String tenMonAn;
    private double donGia;
    private String moTa;
    private int anhMinhHoa;

    public MonAn(String tenMonAn, double donGia, String moTa, int anhMinhHoa) {
        this.tenMonAn = tenMonAn;
        this.donGia = donGia;
        this.moTa = moTa;
        this.anhMinhHoa = anhMinhHoa;
    }

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getAnhMinhHoa() {
        return anhMinhHoa;
    }

    public void setAnhMinhHoa(int anhMinhHoa) {
        this.anhMinhHoa = anhMinhHoa;
    }
}
