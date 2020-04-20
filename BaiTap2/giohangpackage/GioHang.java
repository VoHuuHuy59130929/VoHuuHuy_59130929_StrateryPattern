package giohangpackage;

import java.util.List;
import java.util.ArrayList;

public class GioHang {
  public List<HangHoa> dsHH = new ArrayList<HangHoa>();
  public IThanhToan hinhThucTT;
  public void setHinhThucTT (IThanhToan hinhThucTT) {
    this.hinhThucTT = hinhThucTT;
  }
  public void themHang(HangHoa hangHoa) {
    this.dsHH.add(hangHoa);
  }
  public String inDSHH() {
    String kq = "-----Danh sach hang hoa-----\n";
    for (HangHoa hangHoa: this.dsHH) {
      kq += hangHoa.getHangHoa();
    }
    return kq;
  }
  public int tienHang () {
    int sum = 0;
    for (HangHoa hangHoa: this.dsHH) {
      sum += hangHoa.getGia();
    }
    return sum;
  }
  public double thanhToan () {
    return this.hinhThucTT.thanhToan(tienHang());
  }
}