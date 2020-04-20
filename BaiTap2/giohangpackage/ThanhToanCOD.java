package giohangpackage;

public class ThanhToanCOD implements IThanhToan {
  @Override
  public double thanhToan (int tienHang) {
    return tienHang > 2000000 ? tienHang - (tienHang * 0.02) : tienHang;
  }
}