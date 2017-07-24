package java_8;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamInit {


    @Test
    public void streamInit1() {
        Stream.of("A", "B", "C").forEach(System.out::println);
    }

    @Test
    public void streamInit2() {
        String[] letters = {"A", "B", "C"};

        Arrays.stream(letters).forEach(System.out::println);
    }

    @Test
    public void streamInit3() throws IOException {

        Files.lines(Paths.get("src\\main\\java\\java_8\\data.txt")).forEach(s -> {
            try {
                Files.write(Paths.get("src\\main\\java\\java_8\\data2.txt"), s.getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    @Test
    public void streamInit4() {
        "Hello world".chars().forEach(System.out::println);
    }

    @Test
    public void streamInit5() {
        Stream.builder().add("a1").add("a2").add("a3").build().forEach(System.out::println);
    }


}
