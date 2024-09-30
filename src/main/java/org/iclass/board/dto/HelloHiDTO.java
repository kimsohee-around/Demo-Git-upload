package org.iclass.board.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class HelloHiDTO {
    private String message;
    private String sender;
    private String recipient;
}

//정준영