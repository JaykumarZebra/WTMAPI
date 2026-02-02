package com.jayzebra.usermodule.domain.dto;

import lombok.*;


import lombok.Data;

@Getter
@Setter
@AllArgsConstructor
public class UserAssetUploadResponseDto {
    private String userId;
    private String newProfileImageUrl;
}

