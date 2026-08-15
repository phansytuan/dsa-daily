import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class _MediumGradeOfClassTest {

    private static Locale defaultLocale;

    /** mediumGrade dùng String.format nên kết quả phụ thuộc locale mặc định. */
    @BeforeAll
    static void useDotAsDecimalSeparator() {
        defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
    }

    @AfterAll
    static void restoreLocale() {
        Locale.setDefault(defaultLocale);
    }

    private static ArrayList<ArrayList<Integer>> scores(int[]... students) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int[] student : students) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int score : student) {
                row.add(score);
            }
            result.add(row);
        }
        return result;
    }

    @Test
    void averagesThePerStudentAveragesWithTwoDecimals() {
        // học sinh 1: (8+10)/2 = 9 ; học sinh 2: (7+5)/2 = 6 ; trung bình = 7.50
        assertEquals("7.50", _MediumGradeOfClass.mediumGrade(scores(new int[] {8, 10}, new int[] {7, 5})));
    }

    @Test
    void weightsEachStudentEquallyRegardlessOfSubjectCount() {
        // học sinh 1: 10 ; học sinh 2: (0+0+0)/3 = 0 ; trung bình = 5.00
        assertEquals("5.00", _MediumGradeOfClass.mediumGrade(scores(new int[] {10}, new int[] {0, 0, 0})));
    }

    @Test
    void roundsToTwoDecimals() {
        // (7+8+9)/3 = 8 ; (9+9)/2 = 9 ; (10)/1 = 10 -> 9.00
        assertEquals("9.00",
                _MediumGradeOfClass.mediumGrade(scores(new int[] {7, 8, 9}, new int[] {9, 9}, new int[] {10})));
        // (1+2)/2 = 1.5 ; 2 -> 1.75
        assertEquals("1.75", _MediumGradeOfClass.mediumGrade(scores(new int[] {1, 2}, new int[] {2})));
    }

    @Test
    void parsesNestedListInput() {
        List<ArrayList<Integer>> parsed = _MediumGradeOfClass.parseInput("[[8, 10], [7, 5]]");

        assertEquals(2, parsed.size());
        assertEquals(List.of(8, 10), parsed.get(0));
        assertEquals(List.of(7, 5), parsed.get(1));
    }

    @Test
    void parsesSingleStudentAndVaryingSubjectCounts() {
        assertEquals(List.of(List.of(9)), _MediumGradeOfClass.parseInput("[[9]]"));
        assertEquals(List.of(List.of(1, 2, 3), List.of(4)), _MediumGradeOfClass.parseInput("[[1,2,3],[4]]"));
    }
}
