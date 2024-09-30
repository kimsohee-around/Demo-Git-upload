package org.iclass.board.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.iclass.board.dto.TestDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Controller
@Slf4j
public class TestController {

    @GetMapping("/gallery")
    public String gallery() {
        TestDTO dto = new TestDTO();
        log.info("dto: {}", dto);
        return "gallery";
    }
}
