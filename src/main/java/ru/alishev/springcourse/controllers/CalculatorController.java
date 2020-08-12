package ru.alishev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/first")
public class CalculatorController {

    @GetMapping("calculator")
    public String calculate(@RequestParam(value = "firstNum") double firstNum,
                            @RequestParam(value = "actionCalc") String actionCalc,
                            @RequestParam(value = "secondNum") double secondNum,
                            Model model) {
        double result;

        switch (actionCalc) {
            case "multiplication":
                result = firstNum * secondNum;
                break;
            case "addition":
                result = firstNum + secondNum;
                break;
            case "subtration":
                result = firstNum - secondNum;
                break;
            case "division":
                result = firstNum / secondNum;
                break;
            default: result = 0;
        }

        model.addAttribute("answer", result);

        return "first/calculator";
    }
}
