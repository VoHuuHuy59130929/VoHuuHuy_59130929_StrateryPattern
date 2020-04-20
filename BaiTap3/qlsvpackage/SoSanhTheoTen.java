package qlsvpackage;

public class SoSanhTheoTen implements ISoSanh {
  @Override
  public int soSanh (SinhVien o1, SinhVien o2) {
    String hoTenSinhVien1 = o1.getHoTen().toLowerCase();
    String hoTenSinhVien2 = o2.getHoTen().toLowerCase();
    int length = hoTenSinhVien1.length() <= hoTenSinhVien2.length() ? hoTenSinhVien1.length() : hoTenSinhVien2.length();
    for (int i = 0; i < length; i++) {
      int a = hoTenSinhVien1.charAt(i);
      int b = hoTenSinhVien2.charAt(i);
      if (a > b) return 1;
      if (a < b) return -1;
    }
    return 0;
  }
}