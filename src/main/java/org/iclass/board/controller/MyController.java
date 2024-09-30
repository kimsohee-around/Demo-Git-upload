package org.iclass.board.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.iclass.board.dto.GalleryDTO;
import org.iclass.board.service.GalleryUploadService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
@Slf4j
public class MyController {

    private final GalleryUploadService uploadService;

    @GetMapping("/auto")
    public String gallery(Model model) {
        GalleryDTO dto =uploadService.one(1);
        model.addAttribute("dto", dto);
        return "gallery";
    }
}
