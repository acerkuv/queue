import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.Main.myDeque;

public class  TestMain {
    static List<Integer> t = new ArrayList<>(Arrays.asList(1, 2, 3, 4,5, 7));
    @Test
    public  void test() {
        Assertions.assertEquals(myDeque(t), Arrays.asList(7, 5, 4, 3, 2, 1) );


    }
}
