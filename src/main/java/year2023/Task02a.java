package year2023;

import common.Utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02a {

    private final static int MAX_RED = 12;
    private final static int MAX_GREEN = 13;
    private final static int MAX_BLUE = 14;

    public final static Pattern green = Pattern.compile("(\\d+) green");
    public final static Pattern red = Pattern.compile("(\\d+) red");
    public final static Pattern blue = Pattern.compile("(\\d+) blue");
    public final static Pattern game = Pattern.compile("Game (\\d+):");

    public static void main(String[] args) throws URISyntaxException, IOException {
        List<String> input = Utils.getInput("task02.txt");
        System.out.println(solution(input));
    }

    private static int solution(List<String> input) {
        int sum = 0;
        for (String line: input) {
            Matcher greenMatcher = green.matcher(line);
            if(greenMatcher.results().anyMatch(r -> Integer.parseInt(r.group(1)) > MAX_GREEN)) {
                continue;
            }
            Matcher redMatcher = red.matcher(line);
            if(redMatcher.results().anyMatch(r -> Integer.parseInt(r.group(1)) > MAX_RED)) {
                continue;
            }
            Matcher blueMatcher = blue.matcher(line);
            if(blueMatcher.results().anyMatch(r -> Integer.parseInt(r.group(1)) > MAX_BLUE)) {
                continue;
            }
            Matcher gameMatcher = game.matcher(line);
            gameMatcher.find();
            sum += Integer.parseInt(gameMatcher.group(1));
        }
        return sum;
    }
}
