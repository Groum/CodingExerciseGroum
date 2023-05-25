import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestPerfectSquare {

    PerfectSquare checkPerfectSquare = new PerfectSquare();


    @Test // postive Test
    public void testPerfectSquares() {
        List<Integer> numbers = Arrays.asList(16, 75, 36, 64, 94);

        List<Integer> expected = Arrays.asList(16, 36, 64);

        List<Integer> actual = checkPerfectSquare.ingest(numbers);

        assertEquals(expected, actual);
    }

    @Test // Negative Test no Perfect squer number in the list
    public void testnoPerfectSquares() {
        List<Integer> numbers = Arrays.asList( 7, 13, 15 );
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = checkPerfectSquare.ingest(numbers);
        assertEquals(expected, actual);
    }

}
