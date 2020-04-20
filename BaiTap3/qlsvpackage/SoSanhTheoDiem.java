package qlsvpackage;

public class SoSanhTheoDiem implements ISoSanh {
  @Override
  public int soSanh (SinhVien o1, SinhVien o2) {
    return o1.getDiemTB() > o2.getDiemTB() ? 1 : (o1.getDiemTB() == o2.getDiemTB() ? 0 : -1);
  }
}