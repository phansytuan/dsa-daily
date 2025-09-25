public class FsoftSearchingChallenge {

  // Phương thức tìm kiếm và tính tổng các số xuất hiện trong chuỗi đầu vào
  public static String SearchingChallenge(String str) {

    int sum = 0;           // Biến lưu tổng các số được tìm thấy
    String number = "";    // Biến lưu trữ tạm thời cho các chữ số liên tiếp để tạo thành số

    // Duyệt qua từng ký tự trong chuỗi
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i); // Lấy ký tự tại vị trí i

      // Kiểm tra xem ký tự có phải là số hay không
      if (Character.isDigit(c)) {
        // Nếu là số, nối ký tự vào biến number để xây dựng số có hơn 1 chữ số
        number += c;
      } else {
        // Nếu gặp ký tự không phải số & vừa xong đã có số trong biến number
        if (!number.equals("")) {
          // Chuyển chuỗi số sang kiểu số nguyên và cộng vào tổng
          sum += Integer.parseInt(number);
          // Đặt lại biến number để chuẩn bị cho số tiếp theo
          number = "";
        }
      }
    }

    /*
    cho trường hợp nếu chuỗi kết thúc bằng số (ví dụ: "75Number9" kết thúc bằng số "9"),
    vòng lặp sẽ không gặp ký tự nào sau số đó để kích hoạt việc chuyển đổi và cộng số.
    */
    // Sau vòng lặp, kiểm tra nếu chuỗi kết thúc bằng một (dãy) số
    if (!number.equals("")) {
      // Chuyển đổi và cộng số cuối cùng vào tổng
      sum += Integer.parseInt(number);
    }

    // Trả về tổng các số dưới dạng chuỗi
    return Integer.toString(sum);
  }

  public static void main(String[] args) {
    System.out.println(SearchingChallenge("75Number9"));
    // Output: 84

    System.out.println(SearchingChallenge("10 2One Number*1*"));
    // Output: 13

    System.out.println(SearchingChallenge("88Hello 3World!"));
    // Output: 91

    System.out.println(SearchingChallenge("5Hello 5"));
    // Output: 10
  }
}
