package qlsvpackage;

import java.util.Date;

public class SinhVien {
  private String hoTen;
  private Date ngaySinh;
  private float diemTB;
  public SinhVien (String hoTen, Date ngaySinh, float diemTB) {
    setHoTen(hoTen);
    setNgaySinh(ngaySinh);
    setDiemTB(diemTB);
  }
  public void setHoTen (String hoTen) { this.hoTen = hoTen; }
  public void setNgaySinh (Date ngaySinh) { this.ngaySinh = ngaySinh; }
  public void setDiemTB (float diemTB) { this.diemTB = diemTB; }

  public String getHoTen () { return this.hoTen; }
  public Date getNgaySinh () { return this.ngaySinh; }
  public float getDiemTB () { return this.diemTB; }

  public String getSinhVien () {
    return "Ho ten sinh vien: " + getHoTen() + "\n"
      + "Ngay sinh: " + getNgaySinh() + "\n"
      + "Diem trung binh: " + getDiemTB() + "\n";
  }
}