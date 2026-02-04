package com.zebra.feedsmodule.domain.dto;

import lombok.*;
import jakarta.validation.constraints.NotBlank;
import org.springframework.modulith.NamedInterface;

//Dto for creating feed request
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeedCreateRequestDto {
    @NotBlank(message = "Title cannot be empty.")
    private String title;

    @NotBlank(message = "Message cannot be empty.")
    private String message;
}
