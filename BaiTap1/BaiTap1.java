import contextpackage.*;

public class BaiTap1 {
  public static void main (String[] args) {
    Context context = new Context();
    context.setTinhtoan(new Cong());
    System.out.println("1 + 2 = " + String.format("%.2f", context.tinh(1, 2)));
    context.setTinhtoan(new Tru());
    System.out.println("1 - 2 = " + String.format("%.2f", context.tinh(1, 2)));
    context.setTinhtoan(new Nhan());
    System.out.println("1 * 2 = " + String.format("%.2f", context.tinh(1, 2)));
    context.setTinhtoan(new Chia());
    System.out.println("1 / 2 = " + String.format("%.2f", context.tinh(1, 2)));
  }
}