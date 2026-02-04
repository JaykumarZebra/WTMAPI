package com.zebra.feedsmodule.domain.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.OffsetDateTime;


 //DTO for the POST /feednotes request body.


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeedNoteCreateRequestdto {

    @NotBlank(message = "Message cannot be empty.")
    private String message;
}
