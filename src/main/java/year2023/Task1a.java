package year2023;

import common.Utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class Task1a {
    public static void main(String[] args) throws IOException, URISyntaxException {
        List<String> input = Utils.getInput("task1a.txt");
        System.out.println(solution(input));
    }

    public static int solution(List<String> input) {
        int sum = 0;
        for (String line : input) {
            char first = ' ', second = ' ';
            for (char c : line.toCharArray()) {
                if (c >= '0' && c <= '9') {
                    if (first == ' ') {
                        first = c;
                    }
                    second = c;
                }
            }
            char[] combined = {first, second};
            String nm = String.valueOf(combined);
            int number = Integer.parseInt(nm);
            sum += number;
        }
        return sum;
    }

}
