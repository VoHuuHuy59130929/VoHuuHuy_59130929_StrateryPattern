package giohangpackage;

public class HangHoa {
  private String tenHH;
  private int gia;
  private String moTa;
  public HangHoa (String tenHH, int gia, String moTa) {
    setTenHH(tenHH);
    setGia(gia);
    setMoTa(moTa);
  }
  public void setTenHH (String tenHH) { this.tenHH = tenHH; }
  public void setGia (int gia) { this.gia = gia; }
  public void setMoTa (String moTa) { this.moTa = moTa; }
  public String getTenHH () { return this.tenHH; }
  public int getGia () { return this.gia; }
  public String getMoTa () { return this.moTa; }
  public String getHangHoa () {
    return "Ten hang hoa: " + getTenHH() + "\n"
      + "Gia: " + getGia() + "\n"
      + "Mo ta: " + getMoTa();
  }
}