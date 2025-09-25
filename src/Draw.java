public class Draw {

  public static void main(String[] args) {
    int canhHinhVuong =5;

    for (int i = 0; i < canhHinhVuong; i++) {
      for (int j = 0; j < canhHinhVuong; j++) {

        if (i == 0 || i == canhHinhVuong -1 || j == 0 || j == canhHinhVuong-1 ) {
          System.out.print("* ");
        }
        else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
// i = 0/ canh -1 -> true || true
// j =0/