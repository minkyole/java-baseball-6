package baseball;

public class CheckBaseballNum {
    static boolean isError(String baseballNum) {
        return (baseballNum.length() != 3 ||
                isDuplicated(baseballNum) ||
                isCorrectRange(baseballNum));
    }

    static boolean isCorrectRange(String baseballNum) {
        for (int i = 0; i < 3; i++) {
            if (!is_digit(baseballNum.charAt(i))) {
                return (true);
            }
        }
        return (false);
    }

    static boolean isDuplicated(String baseballNum) {
        return (baseballNum.charAt(0) == baseballNum.charAt(1) ||
                baseballNum.charAt(0) == baseballNum.charAt(2) ||
                baseballNum.charAt(1) == baseballNum.charAt(2));
    }

    static boolean is_digit(char num) {
        return (num >= '1' && num <= '9');
    }
}