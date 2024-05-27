package com20.task3.dto.userDto;

import com20.task3.entity.User;
import com20.task3.enums.Role;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public record UserRequest(
        String firstName,
        String lastName,
        String email,
        String password,
        String phoneNumber
) {

    public User requestToEntity() {
        return User.builder()
                .firstName(this.firstName)
                .lastName(this.lastName)
                .email(this.email)
                .password(this.password)
                .phoneNumber(this.phoneNumber)
                .build();
    }

    public User requestToEntityForUpdate(User user) {
        user.setFirstName(this.firstName);
        user.setLastName(this.lastName);
        user.setEmail(this.email);
        user.setPassword(this.password);
        user.setPhoneNumber(this.phoneNumber);
        return user;
    }

}
