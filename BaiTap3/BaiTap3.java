import qlsvpackage.*;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class BaiTap3 {
  public static void main(String[] args) {
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    QLSV qlsv = new QLSV();
    try {
      qlsv.themSinhVien(new SinhVien("Võ Hữu Huy", formatter.parse("01/03/1999"), 7));
      qlsv.themSinhVien(new SinhVien("Trần Hoa Tím", formatter.parse("10/10/1999"), 8));
      qlsv.themSinhVien(new SinhVien("Nguyễn Minh Nhựt", formatter.parse("28/08/1999"), 6));
    } catch (ParseException e) {
      e.printStackTrace();
    }
    System.out.println(qlsv.inDSSV());
    System.out.println("----- Sap xep theo diem trung binh -----");
    qlsv.setSoSanh(new SoSanhTheoDiem());
    qlsv.sapXep();
    System.out.println(qlsv.inDSSV());
    System.out.println("----- Sap xep theo ho ten -----");
    qlsv.setSoSanh(new SoSanhTheoTen());
    qlsv.sapXep();
    System.out.println(qlsv.inDSSV());
  }
}