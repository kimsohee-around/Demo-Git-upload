package org.iclass.board.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloHiController {

    @ResponseBody
    public String sayHi(){
        return "안녕하세요";
    }

//    정준영
}
