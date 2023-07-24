import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class fTest {

    @Test
    void les54Test() {
        System.out.println("Запуск les54Test");
        String[] input = new String[]{"а"};
        Assertions.assertEquals(7, Task1.method(input),"Индекс буквы не соответствует ожидаемой");
    }
}
