package org.iclass.board.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ImageDTO {
    private int imageNo;
    private String imageName;
    private String imageArtist;
    private String imageDesc;

}
