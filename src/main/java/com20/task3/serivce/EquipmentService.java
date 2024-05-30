package com20.task3.serivce;

import com20.task3.dto.SimpleResponse;
import com20.task3.dto.equipmentDto.EquipmentRequest;
import com20.task3.dto.equipmentDto.EquipmentResponse;

import java.util.List;

public interface EquipmentService {
    SimpleResponse update(Long id, EquipmentRequest equipmentRequest);

    SimpleResponse delete(Long id);

    SimpleResponse save(EquipmentRequest equipmentRequest);

    EquipmentResponse getById(Long id);

    List<EquipmentResponse> getAll();
}
