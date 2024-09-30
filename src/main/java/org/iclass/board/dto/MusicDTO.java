package org.iclass.board.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MusicDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int piece;
    private String title;
    private String composer;
    private int tempo;

}
