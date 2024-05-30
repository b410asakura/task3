package com20.task3.serivce;

import com20.task3.dto.SimpleResponse;
import com20.task3.dto.alertDto.AlertRequest;
import com20.task3.dto.alertDto.AlertResponse;
import com20.task3.entity.Alert;

import java.util.List;

public interface AlertService {
    List<AlertResponse> getAll();

    AlertResponse getById(Long id);

    SimpleResponse save(AlertRequest alertRequest);

    SimpleResponse delete(Long id);

    SimpleResponse update(Long id, AlertRequest alertRequest);
}
