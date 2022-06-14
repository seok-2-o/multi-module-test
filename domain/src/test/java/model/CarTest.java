package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import support.builder.CarBuilder;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @DisplayName("자동차를 한칸 전진힌다.")
    @Test
    void move() {

        Car car = new Car("jaeseok");
        car.move(() -> true);

        Car expected = new CarBuilder("jaeseok")
                .position(1)
                .build();

        assertThat(car).isEqualTo(expected);
    }
}
