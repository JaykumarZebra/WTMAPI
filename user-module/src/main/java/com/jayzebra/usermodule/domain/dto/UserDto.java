package com.jayzebra.usermodule.domain.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private String id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String profileImageUrl;

}

