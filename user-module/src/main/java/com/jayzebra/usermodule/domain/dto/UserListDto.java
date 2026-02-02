package com.jayzebra.usermodule.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

// Wrapper for returning a list of users, allowing for future pagination fields.
@Getter
@Setter
public class UserListDto {
    private List<UserDto> users;

    public UserListDto(List<UserDto> users) {
        this.users = users;
    }


}

