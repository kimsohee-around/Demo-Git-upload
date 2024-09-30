package org.iclass.board.controller;

import lombok.extern.slf4j.Slf4j;
import org.iclass.board.dto.MusicDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class MusicController {

    @GetMapping("/music")
    public String music(Model model) {
        MusicDTO dto = new MusicDTO();
        model.addAttribute("dto", dto);
        return "music";
    }
}
