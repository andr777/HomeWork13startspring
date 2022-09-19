package pro.sky.HomeWork13startspring.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalcController {
    @GetMapping
    public String Hello(){
        return "Welcome to Calculator";
    }


    @GetMapping(path = "calc")
    public String Calc(){
        return "hello";
    }
}
