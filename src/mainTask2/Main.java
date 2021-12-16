package mainTask2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(args));
        List<String> initialList = new ArrayList<>(Arrays.asList(args));
        Collections.reverse(initialList);
        System.out.println(initialList);

    }
}
