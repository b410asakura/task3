package com20.task3.repository;

import com20.task3.dto.SimpleResponse;
import com20.task3.dto.dataDto.DataResponse;
import com20.task3.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataRepository extends JpaRepository<Data, Long> {
    @Query("select new com20.task3.dto.dataDto.DataResponse(d.id, d.temperature, d.speed, d.pressure) from Data d")
    List<DataResponse> getAll();
}
