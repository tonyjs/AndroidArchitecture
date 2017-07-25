package iammert.com.androidarchitecture;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);

        List<String> strings = new ArrayList<>();

    }

    static class WildcardTestImpl extends WildcardTest<String> {
        @Override
        public void setList(@NotNull List<String> list) {

        }
    }

}