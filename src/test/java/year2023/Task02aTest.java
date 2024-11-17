package year2023;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task02aTest {
    @Test
    public void testRegexMatching(){
        String input = "Game 197: 4 blue, 3 red, 17 green, 19 green, 8 red";
        assertTrue(Task02a.blue.matcher(input).find());
        assertTrue(Task02a.red.matcher(input).find());
        assertTrue(Task02a.green.matcher(input).find());
        assertTrue(Task02a.game.matcher(input).find());


        Task02a.game.matcher(input).results().forEach(res -> System.out.println(res.group(1)));

        Task02a.blue.matcher(input).results().forEach(res -> System.out.println(res.group(1)));
        Task02a.red.matcher(input).results().forEach(res -> System.out.println(res.group(1)));
        Task02a.green.matcher(input).results().forEach(res -> System.out.println(res.group(1)));
    }
}
