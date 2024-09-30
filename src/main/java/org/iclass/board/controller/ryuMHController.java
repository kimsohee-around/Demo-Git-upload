package org.iclass.board.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
@Slf4j
public class ryuMHController {
  @GetMapping("/ryumh")
  public String ryumh() {
    log.info("ryumh");
    return "ryumh";
  }
}
