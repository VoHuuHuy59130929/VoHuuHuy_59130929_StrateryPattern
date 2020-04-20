package giohangpackage;

public class ThanhToanOnline implements IThanhToan {
  @Override
  public double thanhToan (int tienHang) {
    return tienHang < 1000000 ? tienHang - (tienHang * 0.05) : tienHang - (tienHang * 0.07);
  }
}