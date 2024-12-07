package com.klef.jfsd.lab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientController {

    @RequestMapping("/greet")
    public ModelAndView greet(@RequestParam("username") String username) {
        ModelAndView mav = new ModelAndView("greet");
        mav.addObject("username", username);
        return mav;
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/demo1")
    public ModelAndView demo1(@RequestParam("age") int age, @RequestParam("country") String country) {
        ModelAndView mav = new ModelAndView("demo1");
        mav.addObject("age", age);
        mav.addObject("country", country);
        return mav;
    }

    @RequestMapping("/demo2/{a}/{b}")
    public ModelAndView demo2(@PathVariable int a, @PathVariable int b) {
        int subtract = a - b;
        int divide = a / b;
        ModelAndView mav = new ModelAndView("demo2");
        mav.addObject("subtract", subtract);
        mav.addObject("divide", divide);
        return mav;
    }

    @RequestMapping("/productform")
    public String productForm() {
        return "productform";
    }

    @RequestMapping("/multiplyNumbers")
    public ModelAndView multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = num1 * num2;
        ModelAndView mav = new ModelAndView("multiplyNumbers");
        mav.addObject("result", result);
        return mav;
    }

    @RequestMapping("/reverse")
    public ModelAndView reverse(@RequestParam("str1") String str1, @RequestParam("str2") String str2) {
        String reversedStr1 = new StringBuilder(str1).reverse().toString();
        String reversedStr2 = new StringBuilder(str2).reverse().toString();
        ModelAndView mav = new ModelAndView("reverse");
        mav.addObject("reversedStr1", reversedStr1);
        mav.addObject("reversedStr2", reversedStr2);
        return mav;
    }

    @RequestMapping("/calculate")
    public ModelAndView calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int add = num1 + num2;
        int subtract = num1 - num2;
        ModelAndView mav = new ModelAndView("calculate");
        mav.addObject("add", add);
        mav.addObject("subtract", subtract);
        return mav;
    }
}










//localhost:8080/SpringMVC/greet?username=Alice

//localhost:8080/SpringMVC/about

//localhost:8080/SpringMVC/demo1?age=30&country=USA

//localhost:8080/SpringMVC/demo2/400/200

//localhost:8080/SpringMVC/productform

//localhost:8080/SpringMVC/multiplyNumbers?num1=6&num2=7

//localhost:8080/SpringMVC/reverse?str1=Hello&str2=World

//localhost:8080/SpringMVC/calculate?num1=20&num2=15

