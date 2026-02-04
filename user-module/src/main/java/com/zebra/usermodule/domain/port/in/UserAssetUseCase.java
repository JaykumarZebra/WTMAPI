package com.zebra.usermodule.domain.port.in;


import com.zebra.usermodule.domain.dto.UserAssetUploadResponseDto;
import org.springframework.web.multipart.MultipartFile;

public interface UserAssetUseCase {
    UserAssetUploadResponseDto uploadUserImage(String userId, MultipartFile imageFile);
}
