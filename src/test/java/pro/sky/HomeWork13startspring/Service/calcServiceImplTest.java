package pro.sky.HomeWork13startspring.Service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class calcServiceImplTest {
    private final calcServiceImpl calcService = new calcServiceImpl();

    @Test
    void plus() {
        Number resultMetod = calcService.plus(2,3);
        assertThat(resultMetod).isEqualTo(5);

         resultMetod = calcService.plus(1,-3);
        assertThat(resultMetod).isEqualTo(-2);
    }

    @Test
    void minus() {
        Number resultMetod = calcService.minus(4,3);
        assertThat(resultMetod).isEqualTo(1.0);

        resultMetod = calcService.minus(10,-3);
        assertThat(resultMetod).isEqualTo(13.0);
    }

    @Test
    void multiply() {
        Number resultMetod = calcService.multiply(4,2);
        assertThat(resultMetod).isEqualTo(8);

        resultMetod = calcService.multiply(1,-3);
        assertThat(resultMetod).isEqualTo(-3);
    }

    @Test
    void dividePositive() {
        Number resultMetod = calcService.divide(2,1);
        assertThat(resultMetod).isEqualTo(2.0);

        resultMetod = calcService.divide(4,-2);
        assertThat(resultMetod).isEqualTo(-2.0);
    }
    @Test
    void divideNegative() {
        assertThatExceptionOfType(DivideZero.class)
                .isThrownBy(() -> calcService.divide(1,0))
                .withMessage("деление на 0. x/0= ∞");

        assertThatExceptionOfType(DivideZero.class)
                .isThrownBy(() -> calcService.divide(-1,0))
                .withMessage("деление на 0. x/0= ∞");

    }

}