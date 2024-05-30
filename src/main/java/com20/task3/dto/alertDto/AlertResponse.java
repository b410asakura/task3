package com20.task3.dto.alertDto;

import lombok.Builder;

@Builder
public record AlertResponse(
        Long id,
        String info
) {
}
