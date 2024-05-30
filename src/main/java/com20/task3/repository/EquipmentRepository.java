package com20.task3.repository;

import com20.task3.dto.equipmentDto.EquipmentResponse;
import com20.task3.entity.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
    @Query("select new com20.task3.dto.equipmentDto.EquipmentResponse(e.id, e.info, e.model, e.type, e.installationDate, e.status) from Equipment e")
    List<EquipmentResponse> getAll();
}
