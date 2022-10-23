package pro.sky.HomeWork13startspring.Service;

import org.springframework.stereotype.Service;

@Service
public class calcServiceImpl implements calcService {
    @Override
    public int plus(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Double minus(Integer a, Integer b) {
        return (double) (a - b);
    }

    @Override
    public int multiply(Integer a, Integer b) {
        return (a * b);
    }

    @Override
    public Double divide(Integer a, Integer b) {
        if (b != 0) {
            return  (Double.valueOf(a) / Double.valueOf(b));
        } else throw new DivideZero( "деление на 0. x/0= ∞");

    }




}
