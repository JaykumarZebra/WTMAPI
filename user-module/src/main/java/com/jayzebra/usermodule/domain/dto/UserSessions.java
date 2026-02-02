package com.jayzebra.usermodule.domain.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSessions {
    private String userId;
    private String sessionId;
}
