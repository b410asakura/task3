package com20.task3.dto.authenticationDto;

import com20.task3.enums.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class AuthenticationResponse {
    private Long id;
    private String token;
    private String email;
    private Role role;
}
