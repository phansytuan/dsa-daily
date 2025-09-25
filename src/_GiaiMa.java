//import java.util.Scanner;
//import java.util.ArrayList;
//
//class _GiaiMa {
//    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        // Đọc số lượng test case
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            String s = sc.next();
//            int n = sc.nextInt();
//            int L = s.length();
//            int base = L / n;
//            int r = L % n;
//            int maxCol = base + (r > 0 ? 1 : 0);
//
//            // Xác định độ dài của mỗi hàng
//            int[] rowLengths = new int[n];
//            if (n % 2 == 0) { // nếu số hàng chẵn: hàng đầu tiên đến hàng thứ r nhận base+1 ký tự
//                for (int i = 0; i < n; i++) {
//                    rowLengths[i] = (i < r) ? base + 1 : base;
//                }
//            } else { // nếu số hàng lẻ: các hàng từ 1 đến (n - r) nhận base ký tự, phần còn lại nhận base+1
//                for (int i = 0; i < n; i++) {
//                    rowLengths[i] = (i < n - r) ? base : base + 1;
//                }
//            }
//
//            // Tạo lưới dưới dạng mảng StringBuilder cho mỗi hàng
//            StringBuilder[] grid = new StringBuilder[n];
//            for (int i = 0; i < n; i++) {
//                grid[i] = new StringBuilder();
//            }
//
//            int idx = 0;
//            // Điền lưới theo cột từ 1 đến maxCol
//            for (int col = 1; col <= maxCol; col++) {
//                // Lấy danh sách các hàng có đủ số ký tự (>= col)
//                ArrayList<Integer> rows = new ArrayList<>();
//                for (int i = 0; i < n; i++) {
//                    if (rowLengths[i] >= col) {
//                        rows.add(i);
//                    }
//                }
//                // Nếu cột lẻ: điền từ trên xuống
//                if (col % 2 == 1) {
//                    for (int row : rows) {
//                        grid[row].append(s.charAt(idx));
//                        idx++;
//                    }
//                } else { // Nếu cột chẵn: điền từ dưới lên
//                    for (int i = rows.size() - 1; i >= 0; i--) {
//                        int row = rows.get(i);
//                        grid[row].append(s.charAt(idx));
//                        idx++;
//                    }
//                }
//            }
//
//            // Giải mã: đọc lưới theo "snake" từ dưới lên
//            StringBuilder result = new StringBuilder();
//            // Đọc từ hàng dưới cùng (index n-1) lên hàng đầu (index 0)
//            for (int i = n - 1; i >= 0; i--) {
//                // Vị trí của hàng tính từ dưới lên: vị trí 1,2,...
//                int snakePos = n - i;
//                if (snakePos % 2 == 1) {  // nếu vị trí lẻ: đọc từ trái sang phải
//                    result.append(grid[i].toString());
//                } else { // nếu vị trí chẵn: đọc ngược (từ phải sang trái)
//                    result.append(new StringBuilder(grid[i].toString()).reverse().toString());
//                }
//            }
//            System.out.println(result.toString());
//        }
//        sc.close();
//    }
//}
//import java.util.Scanner;
//
//class _GiaiMa {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            String s = sc.next();
//            int n = sc.nextInt();
//            int L = s.length();
//
//            int base = L / n;
//            int r = L % n;
//            int maxCol = base + (r > 0 ? 1 : 0);
//
//            // Xác định số ký tự của mỗi hàng
//            int[] rowLengths = new int[n];
//            for (int i = 0; i < n; i++) {
//                if (n % 2 == 0)  // n chẵn
//                    rowLengths[i] = (i < r) ? base + 1 : base;
//                else           // n lẻ
//                    rowLengths[i] = (i < n - r) ? base : base + 1;
//            }
//
//            // Tạo lưới dưới dạng mảng StringBuilder cho mỗi hàng
//            StringBuilder[] grid = new StringBuilder[n];
//            for (int i = 0; i < n; i++) {
//                grid[i] = new StringBuilder();
//            }
//
//            int idx = 0;
//            // Điền lưới theo cột (0-indexed)
//            for (int col = 0; col < maxCol; col++) {
//                // Nếu (col+1) lẻ: điền từ trên xuống, ngược lại: từ dưới lên
//                if ((col + 1) % 2 == 1) {
//                    for (int i = 0; i < n; i++) {
//                        if (col < rowLengths[i])
//                            grid[i].append(s.charAt(idx++));
//                    }
//                } else {
//                    for (int i = n - 1; i >= 0; i--) {
//                        if (col < rowLengths[i])
//                            grid[i].append(s.charAt(idx++));
//                    }
//                }
//            }
//
//            // Giải mã: đọc lưới theo "snake" từ dưới lên
//            StringBuilder result = new StringBuilder();
//            for (int i = n - 1; i >= 0; i--) {
//                int snakePos = n - i; // tính vị trí từ dưới lên (bắt đầu từ 1)
//                if (snakePos % 2 == 1)
//                    result.append(grid[i]);
//                else
//                    result.append(new StringBuilder(grid[i]).reverse());
//            }
//
//            System.out.println(result);
//        }
//        sc.close();
//    }
//}
//
//import java.util.Scanner;
//
//class Solution {
//    public static void main(String[] args) {
//        // Tạo đối tượng Scanner để đọc dữ liệu đầu vào
//        Scanner sc = new Scanner(System.in);
//
//        // Đọc số lượng test case
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            // Đọc chuỗi mã hóa và số dòng n
//            String s = sc.next();
//            int n = sc.nextInt();
//
//            int L = s.length();                 // Độ dài của chuỗi s
//            int base = L / n;                   // Số ký tự cơ bản mỗi hàng
//            int r = L % n;                      // Số dư, xác định số hàng nhận thêm 1 ký tự
//            int maxCol = base + (r > 0 ? 1 : 0);  // Số cột nhiều nhất (hàng có số ký tự nhiều nhất)
//
//            // Tạo mảng rowLengths chứa số ký tự của từng hàng
//            int[] rowLengths = new int[n];
//            for (int i = 0; i < n; i++) {
//                if (n % 2 == 0) {
//                    // Nếu n chẵn: các hàng từ 0 đến r-1 có (base+1) ký tự, các hàng còn lại có base ký tự
//                    rowLengths[i] = (i < r) ? base + 1 : base;
//                } else {
//                    // Nếu n lẻ: các hàng từ 0 đến n-r-1 có base ký tự, các hàng từ n-r đến n-1 có (base+1) ký tự
//                    rowLengths[i] = (i < n - r) ? base : base + 1;
//                }
//            }
//
//            // Tạo mảng StringBuilder để lưu từng hàng của lưới
//            StringBuilder[] grid = new StringBuilder[n];
//            for (int i = 0; i < n; i++) {
//                grid[i] = new StringBuilder();
//            }
//
//            int idx = 0;  // Chỉ số ký tự hiện tại trong chuỗi s
//
//            // Điền lưới theo cột (sử dụng chỉ số cột 0-indexed)
//            for (int col = 0; col < maxCol; col++) {
//                // Nếu (col+1) lẻ (vì col bắt đầu từ 0)
//                if ((col + 1) % 2 == 1) {
//                    // Duyệt từ hàng trên xuống (từ 0 đến n-1)
//                    for (int i = 0; i < n; i++) {
//                        // Chỉ điền ký tự nếu hàng đó có cột col (tức rowLengths[i] > col)
//                        if (col < rowLengths[i]) {
//                            grid[i].append(s.charAt(idx));
//                            idx++;
//                        }
//                    }
//                } else {
//                    // Nếu (col+1) chẵn: duyệt từ dưới lên (từ n-1 đến 0)
//                    for (int i = n - 1; i >= 0; i--) {
//                        if (col < rowLengths[i]) {
//                            grid[i].append(s.charAt(idx));
//                            idx++;
//                        }
//                    }
//                }
//            }
//
//            // Giải mã: đọc lưới theo quy tắc "snake" từ dưới lên
//            StringBuilder result = new StringBuilder();
//            // Duyệt từ hàng cuối (n-1) lên hàng đầu (0)
//            for (int i = n - 1; i >= 0; i--) {
//                int snakePos = n - i; // Vị trí của hàng tính từ dưới lên, bắt đầu từ 1
//                if (snakePos % 2 == 1)
//                    // Nếu vị trí lẻ: đọc hàng theo thứ tự bình thường (từ trái sang phải)
//                    result.append(grid[i]);
//                else
//                    // Nếu vị trí chẵn: đọc hàng theo thứ tự ngược lại (từ phải sang trái)
//                    result.append(new StringBuilder(grid[i]).reverse());
//            }
//
//            // In kết quả của test case hiện tại
//            System.out.println(result);
//        }
//        sc.close();
//    }
//}
import java.util.*;

public class _GiaiMa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < t; i++) {
            String[] input = scanner.nextLine().split(" ");
            String s = input[0];
            int n = Integer.parseInt(input[1]);

            System.out.println(decodeMessage(s, n));
        }
        scanner.close();
    }

    public static String decodeMessage(String s, int n) {
        int len = s.length();
        int cols = (int) Math.ceil((double) len / n);
        char[][] grid = new char[n][cols];
        int index = 0;

        // diền dữ liệu vào lưới theo cột
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < n; row++) {
                if (index < len) {
                    grid[row][col] = s.charAt(index++);
                } else {
                    grid[row][col] = ' '; //diền khoảng trắng
                }
            }
        }

        //dọc dữ liệu theo hàng
        StringBuilder decodedMessage = new StringBuilder();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] != ' ') {
                    decodedMessage.append(grid[row][col]);
                }
            }
        }

        return decodedMessage.toString();
    }
}
