package org.iclass.board.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/gallery")
@Slf4j

public class ImageController {

    @GetMapping("/images")
    public String images(){
        return "gallery/images";
    }

    @PostMapping("/images")
    public String uploadImage(){
        return "redirect:/gallery/images";
    }
}
