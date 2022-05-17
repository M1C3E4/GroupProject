package recruitmentplatform.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mock;

@SpringBootTest
class DemoApplicationTests {

    @Test
    public void shouldReturnText() throws Exception {
        String expected = "witajSwiecie";
        String received = "witajSwiecie";
        Assertions.assertEquals(received, expected);
    }
}
