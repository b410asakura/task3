package com20.task3.serivce.impl;

import com20.task3.dto.SimpleResponse;
import com20.task3.dto.equipmentDto.EquipmentRequest;
import com20.task3.dto.equipmentDto.EquipmentResponse;
import com20.task3.entity.Data;
import com20.task3.entity.Equipment;
import com20.task3.globalException.NotFoundException;
import com20.task3.repository.EquipmentRepository;
import com20.task3.serivce.EquipmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipmentServiceImpl implements EquipmentService {
    private final EquipmentRepository equipmentRepository;

    @Override
    public SimpleResponse update(Long id, EquipmentRequest equipmentRequest) {
        Equipment equipment = equipmentRepository.findById(id).orElseThrow(
                () -> new NotFoundException(
                        "There is no equipment with id: " + id
                )
        );
        equipment.setInfo(equipmentRequest.info());
        equipment.setModel(equipmentRequest.model());
        equipment.setType(equipmentRequest.type());
        equipment.setInstallationDate(equipmentRequest.installationDate());
        equipment.setStatus(equipmentRequest.status());
        equipmentRepository.save(equipment);
        return SimpleResponse.builder()
                .httpStatus(HttpStatus.OK)
                .message("equipment updated")
                .build();
    }

    @Override
    public SimpleResponse delete(Long id) {
        Equipment equipment = equipmentRepository.findById(id).orElseThrow(
                () -> new NotFoundException(
                        "There is no equipment with id: " + id
                )
        );
        equipmentRepository.delete(equipment);
        return SimpleResponse.builder()
                .httpStatus(HttpStatus.OK)
                .message("equipment deleted")
                .build();
    }

    @Override
    public SimpleResponse save(EquipmentRequest equipmentRequest) {
        Equipment equipment = new Equipment();
        equipment.setInfo(equipmentRequest.info());
        equipment.setModel(equipmentRequest.model());
        equipment.setType(equipmentRequest.type());
        equipment.setInstallationDate(equipmentRequest.installationDate());
        equipment.setStatus(equipmentRequest.status());
        equipmentRepository.save(equipment);
        return SimpleResponse.builder()
                .httpStatus(HttpStatus.OK)
                .message("equipment saved")
                .build();
    }

    @Override
    public EquipmentResponse getById(Long id) {
        Equipment equipment = equipmentRepository.findById(id).orElseThrow(
                () -> new NotFoundException(
                        "There is no equipment with id: " + id
                )
        );
        return EquipmentResponse.builder()
                .info(equipment.getInfo())
                .model(equipment.getModel())
                .type(equipment.getType())
                .installationDate(equipment.getInstallationDate())
                .status(equipment.getStatus())
                .build();
    }

    @Override
    public List<EquipmentResponse> getAll() {
        return equipmentRepository.getAll();
    }
}
