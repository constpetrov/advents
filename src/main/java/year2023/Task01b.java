package year2023;

import common.Utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class Task01b {
    static String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    static String[] digitNames = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void main(String[] args) throws URISyntaxException, IOException {
        List<String> input = Utils.getInput("task01a.txt");
        System.out.println(solution(input));
    }

    static int solution(List<String> input) {
        int sum = 0;
        for (String line: input) {
            int minimumIndex = Integer.MAX_VALUE, maximumIndex = -1;
            String minimumDigit = "";
            String maximumDigit = "";

            for (int i = 0; i < 10; i++) {
                String digit = digits[i];
                int index = line.indexOf(digit);
                if (index != -1 && index < minimumIndex) {
                    minimumIndex = index;
                    minimumDigit = digit;
                }
                index = line.lastIndexOf(digit);
                if (index != -1 && index > maximumIndex) {
                    maximumIndex = index;
                    maximumDigit = digit;
                }

                String digitName = digitNames[i];
                index = line.indexOf(digitName);
                if (index != -1 && index < minimumIndex) {
                    minimumIndex = index;
                    minimumDigit = String.valueOf(i);
                }
                index = line.lastIndexOf(digitName);
                if (index != -1 && index > maximumIndex) {
                    maximumIndex = index;
                    maximumDigit = String.valueOf(i);
                }


            }
            String combined = minimumDigit + maximumDigit;
            sum += Integer.parseInt(combined);
        }
        return sum;
    }
}
