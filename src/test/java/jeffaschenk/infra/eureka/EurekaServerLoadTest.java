package jeffaschenk.infra.eureka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {EurekaServerApplication.class})
public class EurekaServerLoadTest {
    @Test
    public void contextLoads() {
    }
}
