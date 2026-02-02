package com.jayzebra.feedsmodule.domain.dto;


import lombok.*;

import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * DTO representing a single Feed item in API responses.
 * Based on the Feed schema in the OpenAPI specification, using Lombok.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class FeedResponseDto {
    private UUID id;
    private String title;
    private String message;
    private String status;
    private OffsetDateTime createdAt;
}
