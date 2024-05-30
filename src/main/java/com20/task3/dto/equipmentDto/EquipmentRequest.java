package com20.task3.dto.equipmentDto;

import lombok.Builder;

import java.time.ZonedDateTime;

@Builder
public record EquipmentRequest(

        String info,
        String model,
        String type,
        ZonedDateTime installationDate,
        String status) {
}
