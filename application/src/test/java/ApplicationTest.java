import model.Car;
import support.builder.CarBuilder;

public class ApplicationTest {

    void example() {

        Car expected = new CarBuilder("jaeseok")
                .position(1)
                .build();

    }
}
