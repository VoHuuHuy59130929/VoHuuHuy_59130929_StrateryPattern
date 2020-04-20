package qlsvpackage;

import java.util.List;
import java.util.ArrayList;

public class QLSV {
  public List<SinhVien> dsSV = new ArrayList<SinhVien>();
  public ISoSanh soSanh;
  public void setSoSanh (ISoSanh soSanh) { this.soSanh = soSanh; }
  public void themSinhVien (SinhVien sinhVien) {
    dsSV.add(sinhVien);
  }
  public String inDSSV () {
    String kq = "-----Danh sach sinh vien -----\n";
    for (SinhVien sinhvien: this.dsSV) {
      kq += sinhvien.getSinhVien();
    }
    return kq;
  }
  public void sapXep () {
    for (int i = 0; i < dsSV.size(); i++) {
      int index = i;
      for (int j = i + 1; j < dsSV.size(); j++) {
        if (soSanh.soSanh(dsSV.get(i), dsSV.get(j)) == 1) {
          index = j;
        }
      }
      if (i != index) {
        SinhVien tmp = dsSV.get(i);
        dsSV.set(i, dsSV.get(index));
        dsSV.set(index, tmp);
      }
    }
  }
}