package pro.sky.HomeWork13startspring.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.HomeWork13startspring.Service.calcService;

@RestController
@RequiredArgsConstructor
public class calcController {

    private final calcService CalcService;

    @GetMapping
    public String Hello() {
        return "Welcome to Calculator\n use\n http://localhost:8080/calc/plus?a=1&b=2";
    }


    @GetMapping(path = "calc")
    public String Calc() {
        return "use <br> http://localhost:8080/calc/plus?a=1&b=2 <br> " +
                "* plus * <br> " +
                "* minus * <br> " +
                "* divide * <br> " +
                "* divide * <br> ";
    }

    @GetMapping(path = "calc/plus")
    public String Plus(@RequestParam(name = "a") Integer a,
                       @RequestParam(name = "b") Integer b) {
        int plus = CalcService.plus(a, b);
        return a + " + " + b + " = " + plus;
    }

    @GetMapping(path = "calc/minus")
    public String minus(@RequestParam(name = "a") Integer a,
                        @RequestParam(name = "b") Integer b) {
        Double minus = CalcService.minus(a, b);
        return a + " - " + b + " = " + minus;
    }

    @GetMapping(path = "calc/multiply")
    public String multiply(@RequestParam(name = "a") Integer a,
                           @RequestParam(name = "b") Integer b) {
        int multiply = CalcService.multiply(a, b);
        return a + " * " + b + " = " + multiply;
    }

    @GetMapping(path = "calc/divide")
    public String divide(@RequestParam(name = "a") Integer a,
                         @RequestParam(name = "b") Integer b) {
        Double divide = CalcService.divide(a, b);
        return a + " / " + b + " = " + divide;
    }


}
