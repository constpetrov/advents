package year2023;

import common.Utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;

public class Task02b extends Task02a {
    public static void main(String[] args) throws URISyntaxException, IOException {
        var input = Utils.getInput("task02.txt");
        System.out.println(solution(input));
    }

    private static int solution(List<String> input) {
        var res = 0;
        for (var line: input) {
            int maxRed = 0, maxGreen = 0, maxBlue = 0;
            for (var r: red.matcher(line).results().collect(Collectors.toList())) {
                var red = Integer.parseInt(r.group(1));
                if(red > maxRed) {
                    maxRed = red;
                }
            }
            for (var r: green.matcher(line).results().collect(Collectors.toList())) {
                var green = Integer.parseInt(r.group(1));
                if(green > maxGreen) {
                    maxGreen = green;
                }
            }
            for (var r: blue.matcher(line).results().collect(Collectors.toList())) {
                var blue = Integer.parseInt(r.group(1));
                if(blue > maxBlue) {
                    maxBlue = blue;
                }
            }
            res += maxRed * maxGreen * maxBlue;
        }
        return res;
    }
}
