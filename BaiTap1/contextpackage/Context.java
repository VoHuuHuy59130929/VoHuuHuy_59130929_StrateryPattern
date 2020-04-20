package contextpackage;

public class Context {
  ITinh tinhToan;
  public void setTinhtoan (ITinh tinhToan) {
    this.tinhToan = tinhToan;
  }
  public float tinh (float a, float b) { return tinhToan.tinh(a, b); }
}