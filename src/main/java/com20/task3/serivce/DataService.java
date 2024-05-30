package com20.task3.serivce;

import com20.task3.dto.SimpleResponse;
import com20.task3.dto.dataDto.DataRequest;
import com20.task3.dto.dataDto.DataResponse;

import java.util.List;

public interface DataService {
    SimpleResponse update(Long id, DataRequest dataRequest);

    SimpleResponse delete(Long id);

    SimpleResponse save(DataRequest dataRequest);

    DataResponse getById(Long id);

    List<DataResponse> getAll();
}
