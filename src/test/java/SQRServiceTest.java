import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/range.csv")
    void standartTest(int expected, int rangemin, int rangemax) {
        SQRService service = new SQRService();
        int actual = service.SqrtRange(rangemin, rangemax);
        assertEquals(expected, actual);
    }
}
