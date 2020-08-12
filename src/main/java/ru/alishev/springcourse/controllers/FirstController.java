package ru.alishev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false)String name,
                            @RequestParam(value = "surname", required = false)String surname, Model model) {
        model.addAttribute("message", "Hello, " + name + " " + surname );

      //  System.out.println("Hello, " + name + " " + surname);
        return "first/hello";  //first - папка /hello - представление

    }

//    @GetMapping("/hello")
//    public String helloPage(HttpServletRequest request) {  //HttpServletRequest - содержатся все данные запроса от пользователя
//        String name = request.getParameter("name"); //будет получать имя пользователя с ключом name
//        String surname = request.getParameter("surname");
//
//        System.out.println("Hello, " + name + " " + surname);
//        return "first/hello";  //first - папка /hello - представление
//
//    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }
}
