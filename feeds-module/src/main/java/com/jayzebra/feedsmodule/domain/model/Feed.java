package com.jayzebra.feedsmodule.domain.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
public class Feed {
    private UUID id;
    private String title;
    private String message;
    private String status;
    private OffsetDateTime createdAt;
}

