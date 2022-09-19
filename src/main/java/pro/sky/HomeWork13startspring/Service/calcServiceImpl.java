package pro.sky.HomeWork13startspring.Service;

import org.springframework.stereotype.Service;

@Service
public class calcServiceImpl implements calcService {
    @Override
    public int plus(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public int minus(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public int multiply(Integer a, Integer b) {
        return (a * b);
    }

    @Override
    public String divide(Integer a, Integer b) {
        if (b != 0) {
            return " " + (Double.valueOf(a) / Double.valueOf(b));
        } else return "деление на 0. x/0= ∞";

    }


}
