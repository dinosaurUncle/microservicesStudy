package microservicesboot.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MicroservicesBootApplicationTests {

    @Test
    public void test() {
        MathOperation sumOperation = (int a, int b) -> {return a + b;};
        System.out.println(executeOperation(8, 10, sumOperation));

        MessageOperation messageOperation = (message) -> {return "Hello " + message;};

        System.out.println(messageOperation.getMessage("chris"));
    }

    interface MathOperation{
        int operation(int a, int b);
    }

    interface MessageOperation{
        String getMessage(String message);
    }

    private int executeOperation(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }

}
