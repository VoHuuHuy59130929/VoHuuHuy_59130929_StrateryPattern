import giohangpackage.*;

public class BaiTap2 {
  public static void main(String[] args) {
    GioHang gioHang = new GioHang();

    gioHang.themHang(new HangHoa("ROM", 900000, "Read Only Memory"));

    System.out.println("***** Thanh toan online < 1.000.000 *****");
    gioHang.setHinhThucTT(new ThanhToanOnline());
    System.out.println(gioHang.inDSHH());
    System.out.println("Tong tien hang: " + gioHang.tienHang());
    System.out.println("So tien khach can tra: " + String.format("%.2f", gioHang.thanhToan()) + "\n");

    System.out.println("***** Thanh toan COD < 2.000.000 *****");
    gioHang.setHinhThucTT(new ThanhToanCOD());
    System.out.println(gioHang.inDSHH());
    System.out.println("Tong tien hang: " + gioHang.tienHang());
    System.out.println("So tien khach can tra: " + String.format("%.2f", gioHang.thanhToan()) + "\n");

    gioHang.themHang(new HangHoa("RAM", 1200000, "Random Access Memory"));

    System.out.println("***** Thanh toan online >= 1.000.000 *****");
    gioHang.setHinhThucTT(new ThanhToanOnline());
    System.out.println(gioHang.inDSHH());
    System.out.println("Tong tien hang: " + gioHang.tienHang());
    System.out.println("So tien khach can tra: " + String.format("%.2f", gioHang.thanhToan()) + "\n");

    System.out.println("***** Thanh toan COD > 2.000.000 *****");
    gioHang.setHinhThucTT(new ThanhToanCOD());
    System.out.println(gioHang.inDSHH());
    System.out.println("Tong tien hang: " + gioHang.tienHang());
    System.out.println("So tien khach can tra: " + String.format("%.2f", gioHang.thanhToan()) + "\n");
  }
}