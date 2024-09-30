package org.iclass.board.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class TestDTO {

    private int idx;
    private String title;
    private String writer;

    public TestDTO(int idx, String title, String writer) {
        this.idx = idx;
    }
}
