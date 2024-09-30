package org.iclass.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {

    @GetMapping("/index")
    public String GetIndex() {
        return "index";
    }

    @PostMapping("/index")
    public String postIndex() {
        return "index";
    }
}
