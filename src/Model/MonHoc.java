package Module;

public class MonHoc {
    private String maMonHoc;
    private String tenMonHoc;
    private int heSoMonHoc;

    public MonHoc() {
    }

    public MonHoc(String maMonHoc, String tenMonHoc, int heSoMonHoc) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.heSoMonHoc = heSoMonHoc;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public int getHeSoMonHoc() {
        return heSoMonHoc;
    }

    public void setHeSoMonHoc(int heSoMonHoc) {
        this.heSoMonHoc = heSoMonHoc;
    }
}
