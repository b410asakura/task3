package com20.task3.dto.dataDto;

import lombok.Builder;

@Builder
public record DataRequest(
        Long id,
        String temperature,
        String speed,
        String pressure) {
}
