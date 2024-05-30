package com20.task3.api;

import com20.task3.dto.SimpleResponse;
import com20.task3.dto.alertDto.AlertRequest;
import com20.task3.dto.alertDto.AlertResponse;
import com20.task3.dto.equipmentDto.EquipmentRequest;
import com20.task3.dto.equipmentDto.EquipmentResponse;
import com20.task3.serivce.EquipmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipment")
@RequiredArgsConstructor
@PreAuthorize("hasAnyAuthority('ADMIN')")
@Tag(name = "Equipment API")
public class EquipmentApi {
    private final EquipmentService equipmentService;

    @GetMapping("/getAll")
    @Operation(summary = "to get all equipment")
    List<EquipmentResponse> getAll() {
        return equipmentService.getAll();
    }

    @GetMapping("/getById")
    @Operation(summary = "to get equipment by id")
    EquipmentResponse getById(@RequestParam Long id) {
        return equipmentService.getById(id);
    }

    @PostMapping
    @Operation(summary = "to save new equipment")
    SimpleResponse save(@RequestBody EquipmentRequest equipmentRequest) {
        return equipmentService.save(equipmentRequest);
    }

    @DeleteMapping()
    @Operation(summary = "to delete a equipment")
    SimpleResponse delete(@RequestParam Long id) {
        return equipmentService.delete(id);
    }

    @PutMapping()
    @Operation(summary = "to update the equipment")
    SimpleResponse update(@RequestParam Long id,
                          @RequestBody EquipmentRequest equipmentRequest){
        return equipmentService.update(id, equipmentRequest);
    }
}
