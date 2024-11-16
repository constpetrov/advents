package common;

import year2023.Task1a;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Utils {
    public static List<String> getInput(String taskName) throws URISyntaxException, IOException {
        URL resource = Task1a.class.getResource(taskName);
        Path path = Paths.get(resource.toURI());
        List<String> input = Files.readAllLines(path);
        return input;
    }
}
