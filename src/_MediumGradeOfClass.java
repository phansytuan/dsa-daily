import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class _MediumGradeOfClass {
    static String mediumGrade(ArrayList<ArrayList<Integer>> scores) {
        double totalStudentAverage = 0.0;

        // mỗi học sinh, tính trung bình điểm của các môn và cộng dồn
        for (ArrayList<Integer> studentScores : scores) {
            int sum = 0;
            for (int score : studentScores) {
                sum += score;
            }

            double studentAvg = (double) sum / studentScores.size();
            totalStudentAverage += studentAvg;
        }
        // MedGrade là trung bình của các trung bình điểm của học sinh
        double MedGrade = totalStudentAverage / scores.size();
        // Trả về kết quả với 2 chữ số sau dấu thập phân
        return String.format("%.2f", MedGrade);
    }


    /**
     * Takes care of the problem input and output.
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= cases; ++i) {
            String line = scanner.nextLine();
            ArrayList<ArrayList<Integer>> scores = parseInput(line);
            System.out.println("Case " + i + ": " + mediumGrade(scores));
        }
        scanner.close();
    }

    public static ArrayList<ArrayList<Integer>> parseInput(String input) {
        input = input.replace("[[", "[");
        input = input.replace("]]", "]");
        Pattern pattern = Pattern.compile("\\[(.*?)\\]");
        Matcher matcher = pattern.matcher(input);

        ArrayList<String> items = new ArrayList<String>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        while (matcher.find()) {
            String content = matcher.group(1);
            items.add(content);
        }

        for (String item: items) {
            String[] parts = item.split(",");
            ArrayList<Integer> nums = new ArrayList<Integer>();
            for (String part: parts) {
                nums.add(Integer.parseInt(part.trim()));
            }
            result.add(nums);
        }
        return result;
    }
}
